import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {AppComponent} from '../app.component';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(public http: Http) { }
  public getListProduct(){
    return this.http.get(AppComponent.API_URL+"/products")
      .map(response=> response.json());

  }
}
