import { Injectable } from '@angular/core';
import { HttpClient,HttpErrorResponse } from '@angular/common/http';

import { Task } from './Task';

import { Observable } from 'rxjs';


@Injectable({
    providedIn:'root'
})

export class taskServiceService{

    
    private baseurl:string="http://localhost:8080/restgetAlltask";

    constructor(private http:HttpClient){}
    gettask(): Observable<Task[]>{
        return this.http.get<Task[]>(this.baseurl);
    }

   
    }