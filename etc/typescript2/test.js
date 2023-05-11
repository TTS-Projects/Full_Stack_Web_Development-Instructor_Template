// let completed: boolean = false;
// let decimal: number = 6;
// let hex: number = 0xf00d;
// let binary: number = 0b1010;
// let octal: number = 0o744;
// let color: string = "blue";
// color = 'red';
// let numArray: number[] = [1, 2, 3];
// let list: Array<number> = [1, 2, 3];
// Declare a tuple type
var x;
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
//x = [10, "hello"]; // Error
// Type 'number' is not assignable to type 'string'.
// Type 'string' is not assignable to type 'number'.
var Color;
(function (Color) {
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["Blue"] = 4] = "Blue";
})(Color || (Color = {}));
var c = Color.Green;
var notSure = 4;
notSure = "maybe a string instead";
// OK, definitely a boolean
notSure = false;
// OK, return value of 'getValue' is not checked
var str = getValue("myString");
var looselyTyped = 4;
// OK, ifItExists might exist at runtime
looselyTyped.ifItExists();
// OK, toFixed exists (but the compiler doesn't check)
looselyTyped.toFixed();
var strictlyTyped = 4;
//strictlyTyped.toFixed();
// Object is of type 'unknown'.
function warnUser() {
    console.log("This is my warning message");
}
// Not much else we can assign to these variables!
var u = undefined;
var n = null;
var someValue = "this is a string";
var strLength = someValue.length;
function printLabel(labeledObj) {
    console.log(labeledObj.label);
}
var myObj = { size: 10, label: "Size 10 Object" };
printLabel(myObj);
