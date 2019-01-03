import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Category} from '../model/category.model';
import {AppComponent} from '../app.component';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(public http: Http) { }

  public getCategories(){
      return this.http.get(AppComponent.API_URL+"/category/categories")
      .map(response=> response.json());
  }

  public deleteCategory(category : Category){
      return this.http.post(AppComponent.API_URL+"/category/delete", category)
      .map(response=>response.json());
  }

  public updateCategory(category:Category){
      return this.http.put(AppComponent.API_URL+"/category/update", category)
      .map(response=>response.json());
  }

  public addCategory(category:Category){
      return this.http.post(AppComponent.API_URL+"/category/create", category)
      .map(response=>response.json());
  }
}