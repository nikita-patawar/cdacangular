import { Component, OnInit, Input } from '@angular/core';
import { Workspace } from '../workspace';
import {Book} from '../book';
import { UserdashboardService } from '../userdashboard.service';
import { MoreinfoService } from '../moreinfo.service';
import { Router } from '@angular/router';
import {ActivatedRoute} from '@angular/router';
import {CookieService} from 'ngx-cookie-service';
@Component({
  selector: 'app-moreinfo',
  templateUrl: './moreinfo.component.html',
  styleUrls: ['./moreinfo.component.css']
})
export class MoreinfoComponent implements OnInit {
  email1:string;
  workspace:Workspace[];

 
  constructor(public service:MoreinfoService,private router:Router,private activateRouter:ActivatedRoute,private cookie:CookieService) { 
    
  }
  book: Book=new Book(this.cookie.get("username"),this.cookie.get("oemail2"),0,"","","",0);
  message:any;

  ngOnInit() {
    
    
    
    this.activateRouter.params.subscribe(params => {this.email1 = params['email']})
	  this.service.getByEmail(this.email1).subscribe(

      data=>{this.workspace=data;
        this.cookie.set("oemail2",this.email1);
    console.log(this.cookie.get("oemail2"));
      }

    )
	  
  }
  public bookNow(){

    let resp=this.service.doBook(this.book);
    resp.subscribe((data)=>this.message=data);
    this.router.navigate(["/bookings"]);
      }
}
