"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, s) {
        this.stdId = 123;
        this.stdName = "bhavana";
        this.stdsla = 30000;
        this.stdId = i;
        this.stdName = n;
        this.stdsla = s;
    }
    Student.prototype.display = function () {
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdsla);
    };
    return Student;
}());
exports.Student = Student;
var e1 = new Student(124, "shashank", 34000);
e1.display();
