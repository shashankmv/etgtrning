export interface Task{
    tid:number;
    tname:string;
    description:string;
    ownerid:number;
    status: string;
    priority:string;
    notes:string;
    bookmarke:string;
    
    createdon:Date;
    modifiedon:Date;
    
}