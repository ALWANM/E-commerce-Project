import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {User} from '../model/user.model';
import {AppComponent} from '../app.component';

@Injectable()
export class UsersService {
  constructor(public http: Http) { }
  public getUsers(){
    return this.http.get(AppComponent.API_URL+"/account/users")
      .map(response=> response.json());

  }

}
