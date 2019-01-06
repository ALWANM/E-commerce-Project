import { Injectable } from '@angular/core';
import {AppComponent} from '../app.component';
import {Http} from '@angular/http';
import {Order} from '../model/order.model';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(public http: Http) { }

  public deleteorder(order : Order){
      return this.http.post(AppComponent.API_URL+"/order/delete", order)
      .map(response=>response.json());
  }

  public updateorder(order:Order){
      return this.http.put(AppComponent.API_URL+"/order/update", order)
      .map(response=>response.json());
  }

  public addorder(order:Order){
      return this.http.post(AppComponent.API_URL+"/order/create", order)
      .map(response=>response.json());
    }

    public getOrderByUser(id : number){
        return this.http.get(AppComponent.API_URL+"/order/"+id)
      .map(response=>response.json());
    }
}
