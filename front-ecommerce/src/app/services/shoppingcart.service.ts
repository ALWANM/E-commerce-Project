import { Injectable } from '@angular/core';
import {AppComponent} from '../app.component';
import {Http} from '@angular/http';
import {Cartitem} from '../model/cartitem.model';

@Injectable({
  providedIn: 'root'
})
export class ShoppingcartService {

   constructor(public http: Http) { }

  public getcartitems(orderid: number){
      return this.http.get(AppComponent.API_URL+"/orders/items/"+orderid)
      .map(response=> response.json());
  }

  public deletecartitem(cartitem : Cartitem){
      return this.http.post(AppComponent.API_URL+"/cartitem/delete", cartitem)
      .map(response=>response.json());
  }

  public updatecartitem(cartitem:Cartitem){
      return this.http.put(AppComponent.API_URL+"/cartitem/update", cartitem)
      .map(response=>response.json());
  }

  public addcartitem(cartitem:Cartitem){
      return this.http.post(AppComponent.API_URL+"/cartitem/create", cartitem)
      .map(response=>response.json());
  }

}
