import { Component } from "@angular/core";
import {MyService} from './MyService';

@Component({
    selector:'my-own-com',
    template:`<div><p> {{show}} </p></div>`,
    providers:[MyService]
})

export class MyOwnComponenet{
    show:string;
    constructor(my:MyService){
        this.show=my.getName();
    }
}


