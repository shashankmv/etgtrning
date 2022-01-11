export class Student{
    stdId:number=123;
    stdName:string="bhavana";
    stdsla:number=30000;
    
    constructor(i:number,n:string,s:number){
        this.stdId=i;
        this.stdName=n;
        this.stdsla=s;
    }
    display(){
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdsla);
    }
    }
    
    var e1=new Student(124,"shashank",34000);
    e1.display();