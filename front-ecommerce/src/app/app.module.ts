import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ProfileComponent } from './components/profile/profile.component';
import { RegisterComponent } from './components/register/register.component';
import { AuthService } from './services/auth.service';
import { AccountService } from './services/account.service';
import { UrlPermission } from './urlPermission/url.permission';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { routing } from './app.routing'; 
import { HttpModule } from '@angular/http';
import { FacebookModule } from 'ngx-facebook';
import { NavbarComponent } from './components/navbar/navbar.component';
import {UpdateUserService} from './services/updateUser.service';
import { UsersComponent } from './components/users/users.component';
import {UsersService} from './services/users.service';
import { ProductComponent } from './components/product/product/product.component';
import { ProductsComponent } from './components/products/products/products.component';
import { SupplierComponent } from './components/supplier/supplier.component';
import { CategoryComponent } from './components/category/category.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { ShoppingcartComponent } from './components/shoppingcart/shoppingcart.component';
import { ListProductComponent } from './components/list-product/list-product.component';
import { ProductCardComponent } from './components/product-card/product-card.component';
import { OrdersComponent } from './components/orders/orders.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    RegisterComponent,
    NavbarComponent,
    UsersComponent,
    ProductComponent,
    ProductsComponent,
    SupplierComponent,
    CategoryComponent,
    FooterComponent,
    HomeComponent,
    ShoppingcartComponent,
    ListProductComponent,
    ProductCardComponent,
    OrdersComponent,
  ],
  imports: [
   /* BrowserModule, FormsModule, routing, HttpModule,FacebookModule.forRoot()*/
    BrowserModule,FormsModule,routing,HttpModule,FacebookModule.forRoot(), MDBBootstrapModule.forRoot()
  ],
  // declarationde service pour reutilise
  providers: [AuthService,AccountService,UrlPermission,UpdateUserService,UsersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
