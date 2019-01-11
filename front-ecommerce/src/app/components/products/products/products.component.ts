import { Component, OnInit } from '@angular/core';
import {Product} from '../../../model/product.model';
import {ProductService} from '../../../services/product.service';
import {Http} from '@angular/http';
import {Router} from '@angular/router';
import {CategoryService} from '../../../services/category.service';
import {SupplierService} from '../../../services/supplier.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

    currentProduct : Product;
    newProduct : Product = new Product();
    
    products :any;

    error : String;

    listCategories : any;

    listSuppliers : any;

    headElements = ["ID", "Reference", "Name", "Description", "Price", "VAT", "Stock", "Supplier", "Category"];

    currentIndex : number;

  constructor(public router : Router, public http : Http, public productService : ProductService, public categoryService : CategoryService, public supplierService: SupplierService) { 
  }

  ngOnInit() {
      this.getProducts();
      this.getCategories();
      this.getSuppliers();
  }

  //get all products
  getProducts(){
    this.productService.getProducts()
        .subscribe(data=>{
            this.products = data;
            //console.log(data);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  //delete a product
  deleteProduct(product : Product){
        this.productService.deleteProduct(product)
        .subscribe(data=>{
        //console.log(data);
        this.products.splice(this.currentIndex, 1);
        alert("deleted");
      },
        err=>{
            this.error = err;
            console.log(err);
        })
  }


  //add a new product
  addProduct(){
      console.log(this.newProduct);
    this.productService.addProduct(this.newProduct)
    .subscribe(data=>{
        console.log(data);
        this.products.push(data);
      },

        err=>{
            this.error = err;
            console.log(err);
        })
  }
  
  onEdit(product : Product, index: number){
      this.currentProduct = product;
      this.currentIndex = index;
      console.log(this.currentProduct);
  }

  onDelete(product : Product, index : number){
      this.currentIndex = index;
      this.currentProduct = product;
  }

  onNew(product : Product){
    this.newProduct = product;
  }

  //get all categories
  getCategories(){
    this.categoryService.getCategories()
        .subscribe(data=>{
            this.listCategories = data;
            //console.log(this.listCategories);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  //get all suppliers
  getSuppliers(){
    this.supplierService.getSuppliers()
        .subscribe(data=>{
            this.listSuppliers = data;
            //console.log(this.listSuppliers);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }


  //update a product
  updateProduct(){
    this.productService.updateProduct(this.currentProduct)
    .subscribe(data=>{
        this.products[this.currentIndex] = this.currentProduct;
      },

        err=>{
            this.error = err;
            console.log(err);
        })
  }

}
