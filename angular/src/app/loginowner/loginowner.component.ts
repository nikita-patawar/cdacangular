import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {OwnerserviceService} from '../ownerservice.service';
import { NgForm } from '@angular/forms';


import { Workspace } from '../workspace';


@Component({
  selector: 'app-loginowner',
  templateUrl: './loginowner.component.html',
  styleUrls: ['./loginowner.component.css']
})
export class LoginownerComponent implements OnInit {

  constructor(private ownerService : OwnerserviceService,private router: Router) { }

  ngOnInit() {
  }
  
  onSubmit(formData : NgForm)
  {
    let workspace : Workspace = formData.value
   
   
    this.ownerService.loginRequest(workspace).subscribe(
         (response:Response )=>{
            
          this.router.navigate(["/ownerdashboard"]);
            
      }
       
    )
    
  }

}








  
