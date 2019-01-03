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
import { DefaultComponent } from './components/default/default.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    RegisterComponent,
    NavbarComponent,
    UsersComponent,
    DefaultComponent,

         
  ],
  imports: [
    BrowserModule, FormsModule, routing, HttpModule,FacebookModule.forRoot()

  ],
  // declarationde service pour reutilise
  providers: [AuthService,AccountService,UrlPermission,UpdateUserService,UsersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
