import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import {User} from '../../model/user.model';
import {AuthService} from '../../services/auth.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{

  currentUser: User;

    @ViewChild('register') idRegister: ElementRef

    @ViewChild('login') idLogin : ElementRef

    @ViewChild('menuAccount') idMenuAccount : ElementRef

  constructor(public authService: AuthService, public router: Router) { 
      this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    }
    
  ngOnInit() {

      if(this.currentUser === null){
          if(this.idMenuAccount.nativeElement.style.display==="" || this.idMenuAccount.nativeElement.style.display==="inline-block"){
              this.idMenuAccount.nativeElement.style.display = "none";
          }
          if(this.idLogin.nativeElement.style.display==="none"){
              this.idLogin.nativeElement.style.display= "inline-block";
              this.idRegister.nativeElement.style.display = "inline-block";
          }
      }else{
          if(this.idMenuAccount.nativeElement.style.display==="" || this.idMenuAccount.nativeElement.style.display==="inline-block"){
                this.idMenuAccount.nativeElement.style.display = "inline-block";
          }
          if(this.idLogin.nativeElement.style.display===""){
               this.idLogin.nativeElement.style.display="none";
              this.idRegister.nativeElement.style.display="none";
          }
      }
  }
//  login out from the app
  logOut() {
    this.authService.logOut()
      .subscribe(
        data => {
        if(this.idMenuAccount.nativeElement.style.display==="" || this.idMenuAccount.nativeElement.style.display==="inline-block"){
            this.idMenuAccount.nativeElement.style.display = "none";
        }
        if(this.idLogin.nativeElement.style.display==="none"){
            this.idLogin.nativeElement.style.display= "inline-block";
            this.idRegister.nativeElement.style.display = "inline-block";
        }
          this.router.navigate(['/home']);
        },
        error => {
            console.log("error : "+ error);
        });
  }

}
