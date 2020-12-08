
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http:HttpClient) { }


  public doRegister(user){
    
    return this.http.post("http://localhost:8080/user/newUser",user,{responseType:'text' as 'json'});
  }
}