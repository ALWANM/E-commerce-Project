import { Injectable } from '@angular/core';
import {AppComponent} from '../app.component';
import {Http} from '@angular/http';
import {Cartitem} from '../model/cartitem.model';

@Injectable({
  providedIn: 'root'
})
export class CartitemService {

  constructor(public http: Http) { }

  public deletecartitem(cartitem: Cartitem){
      return this.http.post(AppComponent.API_URL+"/cartitem/delete", cartitem)
      .map(response=>response.json());
  }

  public updatecartitem(cartitem:Cartitem){
      return this.http.put(AppComponent.API_URL+"/cartitem/update", cartitem)
      .map(response=>response.json());
  }

  public addcartitem(cartitemtem:Cartitem){
      return this.http.post(AppComponent.API_URL+"/cartitemtem/create", cartitemtem)
      .map(response=>response.json());
    }

    public getcartitemByOrder(id : number){
        return this.http.get(AppComponent.API_URL+"/cartitem/order/items/"+id)
      .map(response=>response.json());
    }
}
