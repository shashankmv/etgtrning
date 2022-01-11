var proArry = [
    { price: "100", product: "Mobile" },
    { price: "200", product: "laptop" },
    { price: "300", product: "Mic" },
    { price: "400", product: "PC" }
];
var newPro = proArry.map(function (value) {
    return value.price;
});
console.log(newPro);
var newPro1 = proArry.map(function (value) { return value.price; });
console.log(newPro1);
var filterEx = proArry.filter(function (value) {
    if (value.price < 300) {
        return true;
    }
});
console.log(filterEx);
var arrowValue = proArry.filter(function (value) { return value.price > 300; });
console.log(arrowValue);
var sortProduct = proArry.sort(function (a, b) { return (a.product > b.product ? 1 : -1); });
console.log(sortProduct);
