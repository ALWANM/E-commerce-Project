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

  constructor(public router : Router, public http : Http, public productService : ProductService, public categoryService : CategoryService, public supplierService: SupplierService) { 
      this.getProducts();
      this.getCategories();
      this.getSuppliers();
  }

  ngOnInit() {
      this.getProducts();
      this.getCategories();
      this.getSuppliers();
  }

  getProducts(){
    this.productService.getProducts()
        .subscribe(data=>{
            this.products = data;
            console.log(data);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  deleteProduct(product : Product){
        this.productService.deleteProduct(product)
        .subscribe(data=>{
        console.log(data);
      },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  addProduct(){
    this.productService.addProduct(this.newProduct)
    .subscribe(data=>{
        console.log(data);
        this.router.navigate(['/products']);
      },

        err=>{
            this.error = err;
            console.log(err);
        })
  }
  
  onEdit(product : Product){
      this.currentProduct = product;
  }

  onDelete(product : Product){
      this.currentProduct = product;
  }

  onNew(product : Product){
    this.newProduct = product;
  }

  getCategories(){
    this.categoryService.getCategories()
        .subscribe(data=>{
            this.listCategories = data;
            console.log(this.listCategories);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  getSuppliers(){
    this.supplierService.getSuppliers()
        .subscribe(data=>{
            this.listSuppliers = data;
            console.log(this.listSuppliers);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  updateProduct(){
    this.productService.updateProduct(this.currentProduct)
    .subscribe(data=>{
        console.log(data);
      },

        err=>{
            this.error = err;
            console.log(err);
        })
  }


}
