import { Component,OnInit } from '@angular/core';
import { taskServiceService } from './task-service.service';
import { Task } from './Task';

@Component({

    selector:'app-task-details',
    templateUrl:'./Task-details.component.html',
    
})

export class TaskDetailsComponent implements OnInit{
    public task !:Task[];
    

    constructor(private TaskService:taskServiceService){}
    ngOnInit(){
        

        this.TaskService.gettask()
        .subscribe(data => this.task= data)

        

    }
    }
