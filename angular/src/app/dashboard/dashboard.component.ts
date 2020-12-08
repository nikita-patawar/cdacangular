import { Component, OnInit } from '@angular/core';

import { Workspace } from '../workspace';
import { UserdashboardService } from '../userdashboard.service';
import { Router } from '@angular/router';
import {CookieService} from 'ngx-cookie-service';





@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  
  workspace:Workspace;

  constructor(public service:UserdashboardService,private router:Router,private cookie:CookieService) { 

    this.workspace=new Workspace("","","","","","","",0,0);
  }

  ngOnInit() {
	  
	  this.service.getall().subscribe(

      workspace=>{this.workspace=workspace;
        this.cookie.set("Area",workspace.Area);
        console.log(this.cookie.get("Area"));
      }

    )
	  
  }
  
  
  public onSubmit(email)
  {
    //this.cookie.set("email2",email);
   // console.log(this.cookie.get("email2"));
    //console.log(email);

    this.router.navigate(["/moreinfo",{"email":email}]);
  }
  public logout()
  {
   
    this.router.navigate(["/home"]);
  }



}

  