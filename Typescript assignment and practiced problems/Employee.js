"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(i, n, s) {
        this.empId = 123;
        this.empName = "bhavana";
        this.empsla = 30000;
        this.empId = i;
        this.empName = n;
        this.empsla = s;
    }
    Employee.prototype.display = function () {
        console.log(this.empId);
        console.log(this.empName);
        console.log(this.empsla);
    };
    return Employee;
}());
exports.Employee = Employee;
var e1 = new Employee(124, "bhavana", 34000);
e1.display();
