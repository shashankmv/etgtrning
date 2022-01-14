import { Component,OnInit } from "@angular/core";
import { DataService1 } from "./Data-Service1";
import { postData1 } from "./postdataObj1";

@Component({
    selector:'app-post2-example',
    templateUrl: './post-example2.component.html',
    styleUrls:['./post-example2.component.css']
})

export class PostExample2Component implements OnInit{
    data:string | undefined;
    posData:postData1 | undefined;
    
    public users:any=[];
    constructor(private dataService:DataService1){}
    ngOnInit(){

    }
    sendData(){
        this.posData=new postData1();

        this.posData.tid=32;
        this.posData.tname="Shashank ";
        this.posData.ownerid=120;
        
        this.dataService.addPost(this.posData).subscribe(data => {console.log(data)
        });
    }
}