import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
import { Workspace } from './workspace';
@Injectable({
  providedIn: 'root'
})
export class UserdashboardService {

 
  constructor( public http:HttpClient) { }
    
    workspaceURL:string="http://localhost:8080/workspace/allWorkspaces";

    getall():any{
      return this.http.get<any>(this.workspaceURL).pipe(
      tap(workspace=>console.log(workspace)));
    }
  
  }
  