import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { tap } from 'rxjs/operators';
import {Workspace} from './workspace';
@Injectable({
  providedIn: 'root'
})
export class MoreinfoService {
w:any
email:any;
workspaceURL:string="http://localhost:8080/workspace/workspaceByName";
  constructor( public http:HttpClient) {

this.w=new Workspace("","","","","","","",0,0);


   }
    
  //email1=this.w.email;
   

   getByEmail(email):any{
      alert(email);
      return this.http.get<any>(this.workspaceURL+"?email="+email).pipe(
       
      tap(workspace=>console.log(workspace)));
    }
   
  
  public doBook(book){
    
    return this.http.post("http://localhost:8080/booking/newBooking",book,{responseType:'text' as 'json'});
  }
}
