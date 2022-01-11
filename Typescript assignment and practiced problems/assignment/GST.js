var GST = /** @class */ (function () {
    function GST() {
    }
    GST.prototype.productPrice = function () {
        var proPrice = (this.price * 0.12) + this.price;
        console.log(proPrice);
    };
    GST.prototype.display = function () {
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    };
    return GST;
}());
var pro1 = new GST();
pro1.pid = 10;
pro1.pname = "Bat";
pro1.price = 12.99;
pro1.display();
pro1.productPrice();
