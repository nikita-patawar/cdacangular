import { Component, OnInit } from '@angular/core';
import { Workspace } from '../workspace';
import { OregisterService } from '../oregister.service';
import { HttpResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-oregister',
  templateUrl: './oregister.component.html',
  styleUrls: ['./oregister.component.css']
})
export class OregisterComponent implements OnInit {


  workspace: Workspace=new Workspace("","","","","","","",0,0);
  message:any;
  registerForm: FormGroup;
  
  private formBuilder: FormBuilder;

 
 
  constructor(private service:OregisterService) {
    

   }

  ngOnInit() {
    
   
    }
  



  
  
  
  public requestNow(){
    let resp=this.service.doRequest(this.workspace);
    resp.subscribe((data)=>this.message=data);
  }
}





