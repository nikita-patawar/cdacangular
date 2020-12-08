import { Injectable } from '@angular/core';
import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class OregisterService {
  workspace: string;
  constructor(private http:HttpClient) { }


  public doRequest(workspace){
    return this.http.post("http://localhost:8080/workspace/newWorkspace",workspace,{responseType:'text' as 'json'});
  }

  public requestConfirmed(workspace){
    return this.http.post("http://localhost:8080/workspace/finalWorkspace",workspace,{responseType:'text' as 'json'});
  }

  //api_url:string = "http://localhost:8080/workspace"
  

  uploadFile(file: File): Observable<HttpEvent<{}>> {
		const formdata: FormData = new FormData();
		formdata.append('file', file);
		const req = new HttpRequest('POST', this.workspace, formdata, {
			  reportProgress: true,
			  responseType: 'text'
		});
	
		return this.http.request(req);
   }
}
