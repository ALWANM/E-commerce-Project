import { Component, OnInit } from '@angular/core';
import {Product} from '../../../model/product.model';
import {ProductService} from '../../../services/product.service';
import {Http} from '@angular/http';
import {Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

    error : String;

    product : Product;

    //product id
    id : String
    
    //list of cart item
    listCart : any;
    
  constructor(public route : ActivatedRoute, public router : Router, public http : Http, public productService : ProductService) { }

  ngOnInit() {
      this.id = this.route.snapshot.paramMap.get('id');
      this.getProduct(this.id);
  }

  //get product by id
  getProduct(id : String){
      console.log(id);
      this.productService.getProduct(id)
        .subscribe(data=>{
            this.product = data;
            //console.log(data);
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  //add a new product into cart
  onAdd(product: Product){
    var item = {id : product.productID, quantity : 1, ref: product.reference, price : product.price};
    console.log(JSON.parse(localStorage.getItem("cart")));
    this.listCart = JSON.parse(localStorage.getItem("cart"));
    if(this.listCart===null){
        this.listCart = [];
    }
    this.listCart.push(item);
    localStorage.setItem("cart", JSON.stringify(this.listCart));
  }
}
