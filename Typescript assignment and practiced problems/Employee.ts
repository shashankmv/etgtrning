export class Employee{
empId:number=123;
empName:string="bhavana";
empsla:number=30000;

constructor(i:number,n:string,s:number){
    this.empId=i;
    this.empName=n;
    this.empsla=s;
}
display(){
    console.log(this.empId);
    console.log(this.empName);
    console.log(this.empsla);
}
}

var e1=new Employee(124,"bhavana",34000);
e1.display();