import { Component, OnInit } from '@angular/core';
import {User} from '../../model/user.model';
import {UpdateUserService} from '../../services/updateUser.service';
import {UsersService} from '../../services/users.service';
import {AuthService} from '../../services/auth.service';
import {AccountService} from '../../services/account.service';
import {Router} from '@angular/router';
import {Http} from '@angular/http';
import {ProductsService} from '../../services/products.service';
import {Product} from '../../model/product.model';
import {Cartitem} from '../../model/cartitem.model';

@Component({
  selector: 'app-default',
  templateUrl: './default.component.html',
  styleUrls: ['./default.component.css']
})
export class DefaultComponent implements OnInit {

  constructor(public authService: AuthService, public router: Router,public http: Http) {
    this.logOut();
  }
  ngOnInit() {
    this.logOut();
  }
  //  log out from the app
  logOut() {
    this.authService.logOut();
    this.router.navigate(['/home']);

  }

}
