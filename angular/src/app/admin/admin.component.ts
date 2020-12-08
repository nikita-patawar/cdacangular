import { Component, OnInit } from '@angular/core';
import { Workspace } from '../workspace';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

 
  workspace:Workspace;

  constructor(public service:AdminService) { 

    this.workspace=new Workspace("","","","","","","",0,0);
  }

  ngOnInit() {
	  
	  this.service.getall1().subscribe(

      workspace=>{this.workspace=workspace;
      }

    )
	  
  }

}
