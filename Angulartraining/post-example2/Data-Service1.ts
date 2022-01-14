import { Injectable } from "@angular/core";
import { HttpClient,HttpHeaders,HttpErrorResponse } from "@angular/common/http";
import { postData1} from "./postdataObj1";

@Injectable({

    providedIn:'root'
})

export class DataService1{
    baseUrl: string="http://localhost:8080/addTask";
    httpOptions={
        headers:new HttpHeaders({
            'Content-Type':'application/json','Authorization':'my-auth-token'
        })
    };
    constructor(private httpClient: HttpClient){}
    addPost(postD1:postData1){
        return this.httpClient.post(this.baseUrl,postD1,this.httpOptions);
    }
}