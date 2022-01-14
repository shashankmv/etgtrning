import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {forexample} from "./forexample";
import {assignment1} from "./assignment1"
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ifexample} from "./ifexample";
import { Username } from "./Username";
import {Pipeexample} from "./Pipeexample";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Customsort }  from './Customsort';
import { CustomDirectiveExample } from './CustomDirectiveExample';
import { MyOwnComponenet } from './MyOwnComponent';
import { MyProductComponenet } from './MyProductComponent';
import {HttpClientModule} from '@angular/common/http';
import { EmployeeDetailsComponent } from './employee-details.component';
import { TaskDetailsComponent } from './task-details.Component';
import { FormExample } from './FormExample';
import { FormValidation } from './FormValidation';
import { PostExampleComponent } from './post-example/post-example.component';
import { NewModule } from './NewModule';
import { PostExample2Component } from './post-example2/post-example2.component';
import { PostCasestudyComponent } from './post-casestudy/post-casestudy.component';

@NgModule({
  declarations: [
    AppComponent,forexample,ifexample,assignment1,Username,Pipeexample,Customsort,CustomDirectiveExample,MyOwnComponenet,MyProductComponenet,EmployeeDetailsComponent,TaskDetailsComponent,FormExample,FormValidation, PostExampleComponent, PostExample2Component, PostCasestudyComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,ReactiveFormsModule,NewModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
