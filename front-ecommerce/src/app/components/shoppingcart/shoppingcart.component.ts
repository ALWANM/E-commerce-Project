import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../services/product.service';
import {Http} from '@angular/http';
import {Router} from '@angular/router';
import {ShoppingcartService} from '../../services/shoppingcart.service';
import {OrderService} from '../../services/order.service';
import {Product} from '../../model/product.model';
import {Order} from '../../model/order.model';
import {User} from '../../model/user.model';
import {Payment} from '../../model/payment.model';
import {Shippinginfo} from '../../model/shippinginfo.model';
import { Cartitem } from '../../model/cartitem.model';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})
export class ShoppingcartComponent implements OnInit {

    listCart : any;
    total = 0;
    error : String;
    listProduct : any;
    product : Product;
    order : Order = new Order();

    payment : Payment;

    user : User;

    shippingInfo : Shippinginfo;

    cartitem : Cartitem;

  constructor(public router : Router, public shoppingCartService : ShoppingcartService, public productService: ProductService, public http : Http, public orderService : OrderService) { }

  ngOnInit() {
      this.listCart = JSON.parse(localStorage.getItem("cart"));
    this.calculTotal();
    this.productService.getProducts()
    .subscribe(data =>{
        this.listProduct = data;
    });
  }

  plus(i: number){
      this.listCart[i].quantity += 1;
      this.calculTotal();
      localStorage.setItem("cart", JSON.stringify(this.listCart));
  }

  minus(i : number){
      if(this.listCart[i].quantity<=1){
        this.remove(i);
      }else{
        this.listCart[i].quantity -= 1;
        this.calculTotal();
        localStorage.setItem("cart", JSON.stringify(this.listCart));
      }
  }

  remove(i: number){
      this.listCart.splice(i, 1);
      this.calculTotal();
      localStorage.setItem("cart", JSON.stringify(this.listCart));
  }

  calculTotal(){
      this.total = 0;
    if(this.listCart !==null){
          this.listCart.forEach(element=> {
          this.total += element.quantity*element.price;
      });
    }
  }

  find(id){
      this.product = null;
      this.listProduct.forEach(element=>{
          if(element.productID == id){
            this.product= element;
          }
      })
  }
  doOrder(){
      if(this.listCart.length>0){
          var products = [];
          this.error = "";
          this.listCart.forEach(element=> {
              this.find(element.id);
                if(this.product.quantityStock>=element.quantity && this.product.quantityStock>0){
                    this.product.quantityStock-= 1;
                    products.push(this.product);
                }else{
                    this.error += element.ref + " not enough quantity, "
                }

        });
        if(this.error === ""){
            products.forEach(element =>{
                this.productService.updateProduct(element)
                .subscribe(data =>{
                    console.log("updated");
                });
            });


            this.user = JSON.parse(localStorage.getItem("currentUser"));
            this.order.user = this.user.userID;
            this.order.amount = this.total;
            this.order.date = new Date();
            this.order.payment = "1";
            this.order.shippingInfo = "1";

            console.log(this.order);
            this.orderService.addorder(this.order).subscribe(data=>{
                console.log(data);
                this.order = data;
            });

            this.listCart.forEach(element =>{
                this.cartitem.quantity = element.quantity;
                this.cartitem.order = this.order.id;
                this.cartitem.product = element.id;
                this.shoppingCartService.addcartitem(this.cartitem)
                .subscribe(data=>{
                    console.log(data);
                })
            });
            localStorage.removeItem("cart");
        }else{
            console.log(this.error);
        }
      }
  }
}
