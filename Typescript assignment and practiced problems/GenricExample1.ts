function getArray12<T>(items:T[]):T[]{
    return new Array<T>().concat(items);
}


let myNumArr12=getArray12<number>([100,200,300]);
let myStrArr12=getArray12<string>(["hello","world"]);


myNumArr12.push(400);
myStrArr12.push("Hello typescript");

myNumArr12.push("hi");
myStrArr12.push(500);

console.log(myNumArr12);
console.log(myStrArr12);