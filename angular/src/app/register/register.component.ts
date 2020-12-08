import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  user: User=new User("","","","",0);
  message:any;

  constructor(private service:RegisterService) { }

  ngOnInit() {
  }
  

  public registerNow(){
let resp=this.service.doRegister(this.user);
resp.subscribe((data)=>this.message=data);
  }

}