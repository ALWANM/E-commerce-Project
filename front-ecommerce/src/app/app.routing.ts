import { Routes, RouterModule } from "@angular/router";

import { ProfileComponent } from "./components/profile/profile.component";

import { UrlPermission } from "./urlPermission/url.permission";

import { LoginComponent } from "./components/login/login.component";

import { RegisterComponent } from "./components/register/register.component";

import {UsersComponent} from './components/users/users.component';

import {ProductsComponent} from './components/products/products/products.component';
import {CategoryComponent} from './components/category/category.component';
import {SupplierComponent} from './components/supplier/supplier.component';
import {HomeComponent} from './components/home/home.component';
import {ProductComponent} from './components/product/product/product.component';  
import {ShoppingcartComponent} from './components/shoppingcart/shoppingcart.component';
import {ListProductComponent} from './components/list-product/list-product.component';
import {OrdersComponent} from './components/orders/orders.component';
import {DefaultComponent} from './components/default/default.component';

const appRoutes: Routes = [
  { path: 'profile', component: ProfileComponent ,canActivate: [UrlPermission] },
  { path: 'register', component: RegisterComponent },
  {path: 'login',component:LoginComponent },
{path:'product/:id', component:ProductComponent},
{path:'shoppingcart', component:ShoppingcartComponent},
  {path: 'home',component:HomeComponent},
  {path: 'users',component:UsersComponent},
    {path : 'products', component:ProductsComponent},
  {path : 'categories', component:CategoryComponent},
  {path : 'suppliers', component:SupplierComponent},
{path:'product', component:ListProductComponent},
{path:'orders', component:OrdersComponent},

  {path:'logout', component:DefaultComponent},
  // otherwise redirect to profile
  { path: '**', redirectTo: '/home' }

];

export const routing = RouterModule.forRoot(appRoutes);
