import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {AppComponent} from '../app.component';
import {User} from '../model/user.model';

@Injectable()
export class UpdateUserService {

  constructor(public http: Http) { }

  public saveUser(user:User){
    return this.http.post(AppComponent.API_URL+"/account/save",user).map(response=> response.json());
  }
  public deleteUser(user:User){
    return this.http.post(AppComponent.API_URL+"/account/delete",user).map(response=> response.json());
  }
}
