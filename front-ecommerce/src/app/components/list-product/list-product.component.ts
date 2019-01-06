import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../services/product.service';
import {Http} from '@angular/http';
import {Router} from '@angular/router';

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.css']
})
export class ListProductComponent implements OnInit {

    products :any;
    error : String
  constructor(public router : Router, public http : Http, public productService : ProductService) { }

  ngOnInit() {
      this.getProducts();
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

  navigate(id: number){
    this.router.navigate(['/product/'+id]);
  }
}
