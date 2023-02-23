// let whatever; //whatever is undefined
// if(whatever) { // whatever is false
// 	console.log(true); //will not run 
// } else {
// 	console.log(false); //this would run
// }

// if(!whatever){
// 	console.log(false); //this would run
// }

// if(false || 0 || null){
// 	console.log("whatever "); //since none of these evaluate to true, this will not run
// }


// true && true 	// true
// true && false 	// false
// false && true 	// false
// false && false 	// false

// true || true 	// true
// true || false 	// true
// false || true 	// true
// false || false 	// false

// let temp = 85;
// let precipitation = false;
// let indoors = true;

// console.log("The temperature is " + temp + " degrees");
// console.log(`The temperature is ${temp} degrees`);


// if (temp > 80 && precipitation === false) {
//   console.log("time to swim!");
// } else if (indoors) {
//   console.log("time to swim!");
// }

// let bottles = 0;

// for (bottles   = 99; bottles > 0; bottles--){
//     console.log(bottles + " bottles of root beer on the wall!");
// }
// if (bottles == 0 ){
//     console.log("Hey! We need more root beer, you peasant because there are none left!");

// }

// let x = 0;
// while(x < 10) {
//     console.log("this code ran " + x)
//     x = x + 1;
//     // or x +=1
//     // or x++
//     break;
// }



// let x = 10;
// do {
//     x = x + 1;
//     // or x +=1
//     // or x++
// } while(x < 10);

// for(let i=0, i<20, i--){
//     //this loop will run forever
//   }
  
//  let x = 20;
//   while(x < 20){
//     if(x > 20){ //this condition cannot be met
//       x--; //this will never happen
//     }
//     //this will run forever
//   }
// for(let i = 0; i < 10; i++) {
// 	console.log(i);
// 	console.log('before continue'); // will print 10 times
// 	continue; // continues to the next iteration
// 	console.log('after continue'); //never happens
// }

// let x = 1
// switch(x) {
//     default:
// 		console.log('default')
//     case true:
//         console.log("value was true");
//         break;
// 	case 0:
// 		console.log('three')
// 	case 1:
// 		console.log(1);
//         break; 
// 	case 2:
// 		console.log(2);
// 		break;
	
// }


// // let test;
// //console.log(test); //console: undefined

// if(test){ //true
//   var  test = true; //create and assign test
//   console.log(!test); //console: true
// }
// console.log(test); //this is dangerous! 

let x = 'as'
switch(x) {
	case 3:
		console.log('three')
    case 'as':
		console.log(2);
        break;
	case 1:
		console.log(1);
        break;
	default:
		console.log('default')
}