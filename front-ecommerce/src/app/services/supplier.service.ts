import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Supplier} from '../model/supplier.model';
import {AppComponent} from '../app.component';

@Injectable({
  providedIn: 'root'
})
export class SupplierService {

  constructor(public http: Http) { }

  public getSuppliers(){
      return this.http.get(AppComponent.API_URL+"/supplier/suppliers")
      .map(response=> response.json());
  }

  public deleteSupplier(supplier : Supplier){
      return this.http.post(AppComponent.API_URL+"/supplier/delete", supplier)
      .map(response=>response.json());
  }

  public updateSupplier(supplier:Supplier){
      return this.http.put(AppComponent.API_URL+"/supplier/update", supplier)
      .map(response=>response.json());
  }

  public addSupplier(supplier:Supplier){
      return this.http.post(AppComponent.API_URL+"/supplier/create", supplier)
      .map(response=>response.json());
  }
}