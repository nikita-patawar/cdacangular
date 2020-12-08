import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
 
onSubmit(formData : NgForm)
{
  if(formData.value.email=="nikita" && formData.value.password=="nikita")
  {
    this.router.navigate(["/admin"]);
  }
}
}