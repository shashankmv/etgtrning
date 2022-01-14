import { Component,OnInit } from "@angular/core";
import { FormGroup,FormControl,Validators } from "@angular/forms";
import { Router } from "@angular/router";

@Component({
    selector:'validate',
    templateUrl:'./app.formValidate.html'
})

export class FormValidation implements OnInit{
    constructor(private router:Router){}
    form:any;
    name:string | undefined
    ngOnInit(): void {
        this.form=new FormGroup({
            firstname:new FormControl("",Validators.compose([Validators.required,
            Validators.minLength(3)])),
            lastname:new FormControl(""),
            languages: new FormControl("")});
        }
        onSubmit(user:any){
            console.log(user);
            this.router.navigate(['/TemplateForm'])
            this.name=user.firstname;
        }
    }
