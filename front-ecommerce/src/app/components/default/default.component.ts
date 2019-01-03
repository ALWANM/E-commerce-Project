import { Component, OnInit } from '@angular/core';
import {User} from '../../model/user.model';
import {UpdateUserService} from '../../services/updateUser.service';
import {UsersService} from '../../services/users.service';
import {AuthService} from '../../services/auth.service';
import {AccountService} from '../../services/account.service';
import {Router} from '@angular/router';
import {Http} from '@angular/http';
import {ProductsService} from '../../services/products.service';
import {Product} from '../../model/product.model';
import {Cartitem} from '../../model/cartitem.model';

@Component({
  selector: 'app-default',
  templateUrl: './default.component.html',
  styleUrls: ['./default.component.css']
})
export class DefaultComponent implements OnInit {
  currentUser: User;
  productsPage:any;
  counter:any;
  errorMessage: string;
   card=[];
  constructor(public productService: ProductsService, public router: Router,public http: Http) {
    this.getProduct();
  }
  ngOnInit() {
    this.counter=0;
  }
  getProduct(){
    this.productService.getListProduct()
      .subscribe(data=>{
          this.productsPage=data;
          console.log(data);
        },
        err=>{
          console.log(err);
        })
  }
  onAddToCart(product:Product){
this.counter++;
this.card.push(product);
console.log(this.card);
  }
}
