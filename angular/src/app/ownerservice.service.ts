import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Workspace} from './workspace';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class OwnerserviceService {

    constructor( public http:HttpClient) { }
    
    loginRequest(workspace : Workspace)
  {
    console.log(workspace.role);
    return this.http.post('http://localhost:8080/workspace/ownerAuthenticate',workspace);
    
  }
    
   }

