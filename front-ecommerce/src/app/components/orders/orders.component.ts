import { Component, OnInit } from '@angular/core';
import {OrderService} from '../../services/order.service';
import {User} from '../../model/user.model';
import {Order} from '../../model/order.model';
import {Http} from '@angular/http';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  constructor(public http : Http, public orderService : OrderService) { }

  user : User;

  //list of orders
  listOrder : any;
  ngOnInit() {
      this.user = JSON.parse(localStorage.getItem("currentUser"));
      this.getOrders();
  }

  //get all orders of the user
  getOrders(){
      this.orderService.getOrderByUser(parseInt(this.user.userID)).subscribe(data=>{
          this.listOrder = data;
      });
  }

  view(id : number){
//todo show order details
  }

}
