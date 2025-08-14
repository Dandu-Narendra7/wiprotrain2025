var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var cal = new Calculator();
console.log(cal.add(5, 7));
console.log(cal.subtract(20, 10));
