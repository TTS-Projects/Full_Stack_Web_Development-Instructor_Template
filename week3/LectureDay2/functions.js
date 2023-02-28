// //my first function 
// //Define a function
// function saySomething(something) {
// 	console.log(something); 
// }

// saySomething("Hello function!")

// function add(number1, number2) {
//     // if (number1 == 0 && number2 == 0){
//     //     return (0);
//     // }


//     // else if 
//     // return  (number1 + number2);
//     return ;
// }
// function logNumbers(a=5,b=5) {
// 	console.log(a,b)
// }

// logNumbers(); // '1,undefined'
// logNumbers(1,2,3,4,5) // '1,2'


// // function add(a=1,b=2) {
// // 	console.log(a+b)
// //     return (a+b)
// // }

// // add(); // still prints 3
// // let sum = add();

// // function add() {
// // 	let sum = 0;
// // 	for(let i = 0; i < arguments.length; i++) {
// // 		sum += arguments[i];
// // 	}
// // 	return sum;
// // }
	
// // let multiple_sum  = add();
// // console.log(multiple_sum);


// // function add(...rest_of_arguments) {
// // 	let sum = 0;
// // 	for(let i = 0; i < rest_of_arguments.length; i++) {
// // 		sum += rest_of_arguments[i];
// // 	}
// // 	return sum;
// // }
	
// // add(1,2,3,4,5,6,7,8);
// let billAmount = 100;

// let gratuity = 0.2;

// function gratuity(bill){


//     ...
// }
// gratuity(billAmount)
// function totalWithGrat(){
//     ...
// }
// let totalAmount = billAmount * gratuity; 
// sum = 2;

// let sum = 0;

 // TypeError: notHoisted is not a function

//  hoisted(); // hoistedlogs "foo"

//  function hoisted() {
//    console.log("foo");
//  }

//  notHoisted(); // TypeError: notHoisted is not a function

// function notHoisted() {
//    console.log("bar");
// };

// let calculator = {
// 	add: function(a,b) {
// 		return a + b;
// 	}
// }

// calculator.add(2,3) // 5


// function getGreeting(name) {
// 	let greeting = "hello ";
// 	return greeting + name;
// }

// let greeting1;
// //console.log(greeting1);
// console.log(getGreeting("Mike "));
//getGreeting('Shane'); // 'Hello Shane'
//console.log(greeting) //undefined
//console.log(getGreeting("Shane"))


// function functionName(){
// 	let myVar = "look mom, private variables!";
 
// 	//Do some stuff with myVar...
// }
 
// console.log(myVar); //undefined;

// function helloWorld(){
//     let city = 'New Orleans';

//     let greet = function() {
//         console.log('Hello ' + city);
//     }
//     greet(); // Hello New Orleans
// }
// helloWorld();
// function outer() {
// 	let x = 'x';
// 	function inner() {
// 		let y = 'y';
// 		console.log(x); //'x'
// 	}
// 	console.log(x); // 'x'
// 	console.log(y); // ReferenceError: y is not defined
// }
// outer();
// let landscape = function() {
//     let result = "";

//     let flat = function(size) {
//         for (let count = 0; count < size; count++)
//             result += " _ ";
//     };

//     let mountain = function(size) {
//         result += "/";
//         for (let count = 0; count < size; count++)
//             result += " '";
//         result += "\\";
//     };

//     flat(3);
//     mountain(4);
//     flat(6);
//     mountain(1);
//     flat(1);
//     return result;
// };

// console.log(landscape());
// let a = "heloo";
//   let b = 3;
// function outer(){
//   let a = "hi";
//   let b = 2;
//   //console.log(a, b);
//     function inner(a,b) {
//         console.log(a, b);
//     }
  
//     inner(a,b);
//   }
  
//   outer();

// square brackets: []
// parenthesis: ( ) 
// curly brackets: { }
// quotations: ""