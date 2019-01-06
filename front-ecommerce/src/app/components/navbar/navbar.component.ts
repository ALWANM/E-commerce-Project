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

    @ViewChild('userMenu') idMenuUser : ElementRef
    @ViewChild('workerMenu') idMenuWorker : ElementRef
    @ViewChild('adminMenu') idMenuAdmin : ElementRef    

  constructor(public authService: AuthService, public router: Router) { 
    }
    
  ngOnInit() {
    this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    console.log(this.currentUser);

    //to know if the user is worker, user or admin
      if(this.currentUser === null){
          if(this.idMenuUser.nativeElement.style.display==="" || this.idMenuUser.nativeElement.style.display==="inline-block"){
              this.idMenuUser.nativeElement.style.display = "none";
              this.idMenuWorker.nativeElement.style.display = "none";
              this.idMenuAdmin.nativeElement.style.display = "none";
              
          }
          if(this.idLogin.nativeElement.style.display==="none"){
              this.idLogin.nativeElement.style.display= "inline-block";
              this.idRegister.nativeElement.style.display = "inline-block";
          }
      }else{
          switch(this.currentUser.role){
                    case "ADMIN":
                       console.log("admin");
                        this.idMenuWorker.nativeElement.style.display = "none";
                        this.idMenuUser.nativeElement.style.display = "none";
                        this.idMenuAdmin.nativeElement.style.display = "inline-block";
                    break;
                    case "WORKER":
                        this.idMenuWorker.nativeElement.style.display = "inline-block";
                        this.idMenuUser.nativeElement.style.display = "none";
                        this.idMenuAdmin.nativeElement.style.display = "none";
                    break;
                    default:
                        this.idMenuWorker.nativeElement.style.display = "none";
                        this.idMenuUser.nativeElement.style.display = "inline-block";
                        this.idMenuAdmin.nativeElement.style.display = "none";

                }
          if(this.idLogin.nativeElement.style.display===""){
               this.idLogin.nativeElement.style.display="none";
              this.idRegister.nativeElement.style.display="none";
          }
      }
  }
  
//  log out from the app
  logOut() {
    this.authService.logOut()
      .subscribe(
        data => {
        this.idMenuWorker.nativeElement.style.display = "none";
                        this.idMenuUser.nativeElement.style.display = "none";
                        this.idMenuAdmin.nativeElement.style.display = "none";
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
