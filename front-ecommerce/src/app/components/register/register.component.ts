import { Component, OnInit } from '@angular/core';
import { User } from '../../model/user.model';
import { AccountService } from '../../services/account.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
 user: User = new User();
  errorMessage: string;
  constructor(public accountService: AccountService, public router: Router) { }

  ngOnInit() {
  }

  //register the new user
  register() {

    this.accountService.createAccount(this.user).subscribe(data => {
        //console.log(data);
      this.router.navigate(['/login']);
    }, err => {
      console.log(err);
      this.errorMessage = "username already exist";
    }
    )
  }
}
