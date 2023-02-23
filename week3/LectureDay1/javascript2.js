// // // let x = 7 + 7 + 7 //= 21;
// // //         // Straight arithmetic resulting in a Number value.
// // // console.log(x);
// // // x = 7 + 7 

// // // console.log(x);

// // // x = 14 + "7";
// // // console.log(x);
// // // //+ "7";
// // // // The first two 7's are calculated (14), the last 7
// // // // is concatenated onto the 14 as a string.
// // // // resulting in a string value
// // // // "14" + "7" = "147"

// // // x = "7" + 7 + 7;
// // // // The entire expression is implicitly converted
// // // // into a string and concatenated.
// // // // "7" + 7 = "77"; "77" + 7 = "777"
// // // console.log(x)

// // //y = 72;
// // // y = 72 + "6";
// // // console.log(y);

// // // let zebra = "2";
// // // zebra = zebra + 246;
// // // console.log(zebra);


// // let amountRaisedSoFar = 1000;

// // let donation = prompt("How much would you like to donate?"); 

// // amountRaisedSoFar = Number(donation) + amountRaisedSoFar;

// // console.log("We have now raised: " + amountRaisedSoFar + "!");


// let x = parseInt("10")
// x = parseFloat("10.55"); // 10.55
// console.log(x);
// let y = x.toString(); // "10.55";
// console.log(y + 5)


// let greeting = "Hello,"; 
// let entity = "World";
// console.log(greeting + " " + entity + "!"); //output "Hello, World!"" 


// //template literal examples
// let name = "Shane"; 
// let age = 25;

// console.log(`Happy Birthday ${name}! How is ${age+1} treating you?`);


// let something;
// console.log(typeof something) // "undefined"

// something = "hi"; 
// console.log(typeof something) // "undefined"


// foo does not exist, it is not defined and has never been initialized:
//console.log(foo); // "ReferenceError: foo is not defined"

// foo is known to exist now but it has no type or value:
// let foo; 
// console.log(foo);// "null"


	
// //console.log(typeof nothing);//undefined
 
// let something;
// console.log(typeof something); //undefined
// console.log(something); //undefined
 
// something = null;
// console.log(typeof something); //"object"
// console.log(something); //"null"


//Simple if statement
// let x = false;


// if(x  ) {
// 	console.log(true); // true will run this and finish
// }
// else if (x) {
//     console.log("this next branch")
// }
// else if(x){
//     console.log("this branch")
// }

// console.log("nothing happened")


// let temp = 50;

// if (temp != '45') {
//     console.log("I'm going hiking!");
// } else {
//     console.log("It's too cold to go hiking");
// }
// let x = 10;
// if(x == '10') { //Type coersion is happening here!
// 	console.log(true); //true
// }

// if(x === '10') {
// 	console.log(true); //false
// }

// (0 ==  '0') // true
// (0 === '0') // false

// ('' ==  0 ) // true, the string will implicitly be converted to an integer
// ('' === 0 ) // false, no implicit cast is being made



let cups = 5;

if (x <= 3){
    console.log("Yes I'll take another cup of coffee.")
}
else (x > 3 && x <=5){
    console.log("I will wait 30 minutes.");
}
else{
    console.log("I think I'm okay for now.")
}

