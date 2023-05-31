//Declare an add function
function add(number1, number2) {
	return number1 + number2;
}

//Declare a function that takes a function as an argument
function doMath(operation, number1, number2) {
	return operation(number1,number2);
}
/* 
//Pass a function into another.
let sum = doMath(add, 1, 2);

let students = [
	{name: 'John Lennon', average: 90},
	{name: 'Ringo Starr', average: 58},
	{name: 'Paul McCartney', average: 82}
];

let passingStudents = students.filter(function(student){
	return student.average > 60;
});

passingStudents === [
	{name: 'John Lennon', average: 90},
	{name: 'Paul McCartney', average: 82}
];

 */
let students = [
	{firstName: 'Cam', lastName: 'Newton'},
	{firstName: 'Ted', lastName: 'Ginn'},
	{firstName: 'Greg', lastName: 'Olsen'}
]

let fullNames = students.map(function(student){
	return `${student.firstName} ${student.lastName}`;
})

fullNames === ["Cam Newton", "Ted Ginn", "Greg Olsen"]

let teacher = {name: 'Shane'};

let speak = function(item1, item2){
	console.log(this.name, item1, item2);
}

speak.call(teacher, 'coffee', 'ramen'); //'Shane', 'coffee', 'ramen'
speak.apply(teacher, ['coffee', 'ramen']); //'Shane', 'coffee', 'ramen'