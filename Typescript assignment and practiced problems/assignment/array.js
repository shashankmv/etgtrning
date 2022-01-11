var array = /** @class */ (function () {
    function array() {
        this.num1 = [1, 2, 3, 4];
    }
    array.prototype.display = function () {
        var result = this.num1.includes(5);
        console.log(result);
    };
    return array;
}());
var arr = new array();
arr.display();
