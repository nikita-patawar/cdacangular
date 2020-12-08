import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class AdminService {

 
  constructor( public http:HttpClient) { }
    
    workspaceURL:string="http://localhost:8080/workspace/allWorkspaces";

    getall1():any{
      return this.http.get<any>(this.workspaceURL).pipe(
      tap(workspace=>console.log(workspace)));
    }
  
  }