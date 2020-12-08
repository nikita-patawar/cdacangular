import { Component, OnInit } from '@angular/core';
import {LoginService} from '../login.service';
import { NgForm } from '@angular/forms';

import { User } from '../user';
import { Router } from '@angular/router';
import {CookieService} from 'ngx-cookie-service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loginService : LoginService,private router: Router,private cookie:CookieService) { }

  ngOnInit() {
  }
  
  onSubmit(formData : NgForm)
  {
    let user : User = formData.value
    this.cookie.set("username",formData.value.email);
           console.log(this.cookie.get("username"));
          

   
   
    this.loginService.loginRequest(user).subscribe(
         (response:Response )=>{
           //this.cookie.set("username",response["username"]);
           //console.log(this.cookie.get("username"));
          
            
           this.router.navigate(["/dashboard"]);
           
      }
       
    )
    
  }

}
