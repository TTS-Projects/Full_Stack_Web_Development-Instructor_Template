function add(a,b) {
	console.log(a,b)
}

add(1); // '1,undefined'
add(1,2,3,4,5) // '1,2'
function add(a=1,b=2) {
	console.log(a+b)
}

add(); // still prints 3
function add() {
	let sum = 0;
	for(let i = 0; i < arguments.length; i++) {
		sum += arguments[i];
	}
	return sum;
}
	
add(1,2,3,4,5,6,7,8);

function outer() {
	let x = 'x';
	function inner() {
		let y = 'y';
		console.log(x); //'x'
	}
	console.log(x); // 'x'
	console.log(y); // ReferenceError: y is not defined
}