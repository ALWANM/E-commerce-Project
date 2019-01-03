import { Routes, RouterModule } from "@angular/router";

import { ProfileComponent } from "./components/profile/profile.component";

import { UrlPermission } from "./urlPermission/url.permission";

import { LoginComponent } from "./components/login/login.component";

import { RegisterComponent } from "./components/register/register.component";
import {AppComponent} from './app.component';
import {NavbarComponent} from './components/navbar/navbar.component';
import {UsersComponent} from './components/users/users.component';
import {DefaultComponent} from './components/default/default.component';

const appRoutes: Routes = [
  {path: '',component:DefaultComponent},
  { path: 'profile', component: ProfileComponent ,canActivate: [UrlPermission] },
  // { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  {path: 'login',component:LoginComponent },
  {path: 'home',component:DefaultComponent},
  {path: 'users',component:UsersComponent},

  // otherwise redirect to profile
  { path: '**', redirectTo: '/login' }
];

export const routing = RouterModule.forRoot(appRoutes);
