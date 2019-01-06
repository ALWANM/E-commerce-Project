import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Product} from '../model/product.model';
import {AppComponent} from '../app.component';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http: Http) { }

  public getProducts(){
      return this.http.get(AppComponent.API_URL+"/product/products")
      .map(response=> response.json());
  }

  public deleteProduct(product : Product){
      return this.http.post(AppComponent.API_URL+"/product/delete", product)
      .map(response=>response.json());
  }

  public updateProduct(product:Product){
      return this.http.put(AppComponent.API_URL+"/product/update", product)
      .map(response=>response.json());
  } 

  public addProduct(product:Product){
      return this.http.post(AppComponent.API_URL+"/product/create", product)
      .map(response=>response.json());
  }

  public getProduct(id : String){
      return this.http.get(AppComponent.API_URL+"/product/fetch/"+id, id)
      .map(response=> response.json());
  }
}
