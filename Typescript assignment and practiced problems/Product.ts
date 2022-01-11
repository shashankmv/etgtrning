class Product{
    p1:number;
    p2:number;
    p3:number;

    display(){
        if(this.p1>=this.p2 && this.p1>=this.p3){
        console.log(this.p1);}

        if(this.p2>=this.p3 && this.p2>=this.p1){
        console.log(this.p2);}
         
        if(this.p3>=this.p1 && this.p3>=this.p2){
        console.log(this.p3);}
    }
}

var pr1=new Product();
pr1.p1=123;
pr1.p2=125;
pr1.p3=234;
pr1.display();