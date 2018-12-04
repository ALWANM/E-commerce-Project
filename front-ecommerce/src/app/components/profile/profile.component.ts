import { Component, OnInit } from '@angular/core';
import { User } from '../../model/user.model';
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';
import {Http} from '@angular/http';
import {UpdateUserService} from '../../services/updateUser.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  currentUser: User;
  updateUser: User=new User();


    

  constructor(public updateUserService:UpdateUserService,private authService: AuthService, public router: Router,public http: Http) {
    this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    this.updateUser.firstName=this.currentUser.firstName;
    this.updateUser.lastName=this.currentUser.lastName;
    this.updateUser.gender=this.currentUser.gender;
    this.updateUser.password=this.currentUser.password;
    this.updateUser.mail=this.currentUser.mail;
    this.updateUser.address=this.currentUser.address;
    this.updateUser.country=this.currentUser.country;
    this.updateUser.town=this.currentUser.town;
    this.updateUser.postalCode=this.currentUser.postalCode;
    this.updateUser.phoneNumber=this.currentUser.phoneNumber;
    this.updateUser.dateOfBirth=this.currentUser.dateOfBirth;

  }

  ngOnInit() {
  }
//  login out from the app
  /*logOut() {
    this.authService.logOut()
      .subscribe(
        data => {
          this.router.navigate(['/login']);
        },
        error => {

        });
  }*/
  saveUser(){

    this.updateUser.mail=this.currentUser.mail;
    /*this.updateUser.password=this.currentUser.password;*/
    this.updateUserService.saveUser(this.updateUser)
      .subscribe(data=>{
        console.log(data)
      },err=>console.log(err));

      this.authService.logIn(this.updateUser)
      .subscribe(data=>{
      this.router.navigate(['/profile']);
    },err=>console.log(err));
  }
}
