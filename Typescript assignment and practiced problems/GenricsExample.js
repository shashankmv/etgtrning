function getArray(items) {
    return new Array().concat(items);
}
var myNumArr = getArray([100, 200, 300]);
var myStrArr = getArray(["hello", "world"]);
myNumArr.push(400);
myStrArr.push("hello type");
myNumArr.push("hi");
myStrArr.push(500);
console.log(myNumArr);
console.log(myStrArr);
