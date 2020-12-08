import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http' ;
import {User} from './user';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  constructor(private http:HttpClient) { }
  
  loginRequest(user : User)
  {
    console.log(user.role);
    return this.http.post('http://localhost:8080/user/userAuthenticate',user);
    
  }
}
