import { Component, OnInit } from '@angular/core';
import {OrderService} from '../../services/order.service';
import {User} from '../../model/user.model';
import {Order} from '../../model/order.model';
import {Http} from '@angular/http';
import {CartitemService} from '../../services/cartitem.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  constructor(public http : Http, public orderService : OrderService, public cartitemService : CartitemService) { }

  user : User;

  //list of orders
  listOrder : any;

  //list of cart item
  listcartitem : any;
  
  //reference order
  reference : any;

  ngOnInit() {
      this.user = JSON.parse(localStorage.getItem("currentUser"));
      this.getOrders();
  }

  //get all orders of the user
  getOrders(){
      this.orderService.getOrderByUser(parseInt(this.user.userID)).subscribe(data=>{
          this.listOrder = data;
          //console.log(data);
      });
  }

  view(id : number){
    this.reference = id;
    this.cartitemService.getcartitemByOrder(id).subscribe(data=>{
        this.listcartitem = data;
        //console.log(data);
    });
  }

}
