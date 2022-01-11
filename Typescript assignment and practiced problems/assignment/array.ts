class array{
    num1:number[]=[1,2,3,4];
    display(){
        const result=this.num1.includes(5);

        console.log(result);
    }
}

var arr=new array();
arr.display();