

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
let x: [string, number];
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
//x = [10, "hello"]; // Error

// Type 'number' is not assignable to type 'string'.
// Type 'string' is not assignable to type 'number'.
enum Color {
    Red = 1,
    Green = 2,
    Blue = 4,
  }
  let c: Color = Color.Green;

  let notSure: unknown = 4;
  notSure = "maybe a string instead";
  
  // OK, definitely a boolean
  notSure = false;



  declare function getValue(key: string): any;
// OK, return value of 'getValue' is not checked
const str: string = getValue("myString");

let looselyTyped: any = 4;
// OK, ifItExists might exist at runtime
looselyTyped.ifItExists();
// OK, toFixed exists (but the compiler doesn't check)
looselyTyped.toFixed();

let strictlyTyped: unknown = 4;
//strictlyTyped.toFixed();
// Object is of type 'unknown'.

function warnUser(): void {
    console.log("This is my warning message");
  }

// Not much else we can assign to these variables!
let u: undefined = undefined;
let n: null = null;


let someValue: unknown = "this is a string";

let strLength: number = (someValue as string).length;

function printLabel(labeledObj: { label: string }) {
    console.log(labeledObj.label);
  }
  
  let myObj = { size: 10, label: "Size 10 Object" };
  printLabel(myObj);