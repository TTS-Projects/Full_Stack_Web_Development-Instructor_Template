// // let teachers = ['Shane', 'Zack','Ethan', 'Mike'];
// //               //  0        1      2        3
// // console.log(teachers[0]);
// // console.log(teachers.length);

// let teachers = ['Assaf', 'Shane'];
// teachers.push('Zack'); //['Assaf', 'Shane', 'Zack']
// //teachers.pop(); //teacher1 == 'Zack', teachers == ['Assaf', 'Shane']
// //console.log(teacher1);


// teachers[4] = 'James Taylor'; // ['Assaf', 'Shane', 'Zack', undefined, 'James Taylor'];
// teachers[3] = 'Billy Joel'; // ['Assaf', 'Shane', 'Zack', undefined, 'Billy Joel'];////

// console.log(teachers);

// let a = [10,11,20];
// console.log(a.indexOf(11)); //1
// a.indexOf(50); //-1
// console.log(a);

 //let a = [1,2,3,4];

// //Slice - doesn't mutate array, slice(start,end)
 //a.slice(0,2); //[1,2]
 //console.log(a)
// 'abcd'.slice(1,3) // 'bc'

// //Splice - splice(start,numToRemove,...items to add) - this does mutate
//a.splice(1,2,'a','b'); //a is [1,'a','b',4]

// //Iterating over Arrays using for loop and forEach
// let teachers = ['Assaf', 'Shane', 'Zack'];
// for(let i = 0; i < teachers.length; i++) {
// 	console.log(teachers[i]);
// }

// //Uses a function
// teachers.forEach(function(items) {
// 	console.log(items);
// });


//Stringifying
// teachers = ['Assaf', 'Shane'];
// teachers.toString(); // 'Assaf,Shane';
// teachers.join('');// 'Assaf&Shane';
// console.log(teachers.join(' '))

// let a = [2, 1, 3]
// a.sort(); //[1,2,3]

// a.reverse(); //[3,2,1]

// console.log(a)


/* Exercise 1*/
// //1.
// let shopping_list = [ 'pop tarts', 'ramen noodles', 'chips', 'salsa','coffee'];
// //2.
// shopping_list.push('fruit loops');
// //3.
// shopping_list[shopping_list.indexOf('coffee')] = 'fair trade coffee';
// //or shopping_list[4] = 'fair trade coffee'
// //4. 
// shopping_list.splice(2,2, 'rice', 'beans')
// //5.

// shopping_cart = [];
// console.log(shopping_list);

// //6. 
// //
// shopping_cart.push(shopping_list.pop());

// //7. 
// shopping_cart.push(shopping_list.shift());
// console.log(shopping_cart);

// //8.
// let i = shopping_list.length 
// while(i != 0){
//     let item = shopping_list.pop();
//     shopping_cart.push(item);
//     //shopping_cart.push(shopping_list.pop());
//     i--;
// }
// //9. 
// shopping_cart.sort()
// shopping_cart.reverse();
// //10. 
// console.log(shopping_cart.toString());

//Objects
// let course =  {
// 	name: 'JavaScript Applications',
// 	awesome: true,
//     week1: {
//         day1: "github"
//     }
// }
// let course = {
// 	name: 'JavaScript Applications',
//     1: 'java',
//     true: 22,
//     awesome: true,
// 	students: ['Jim', 'Katy'],
// 	instructor: {
// 		name: 'Shane',
// 		favLanguage: 'JavaScript'
// 	}
// }

// //dot notation
// console.log(course.name )
// // bracket notation
// console.log(course["1"])

// // 
// console.log(course.students[0]); //Jim
//advanced example
// let course = {
// 	name: 'JavaScript Applications',
// 	awesome: true,
// 	teachers: ['Assaf', 'Shane'],
// 	students: [
// 		{
// 			name: 'Steve',
// 			computer: {
// 				OS: 'Linux',
// 				type: 'laptop'
// 			}
// 		}
// 	]
// };

// console.log(course.students[0].computer.OS);


// course.name = "super duper class"
// console.log(course.name)

// course.fun = true; //add a property
// delete course.name; //removing the name property.


let course = {
	name: 'JavaScript Applications',
	awesome: true,
	teachers: ['Assaf', 'Shane'],
	students: [
		{
			name: 'Steve',
			computer: {
				OS: 'Linux',
				type: 'laptop'
			}
		},
		{
			name: 'Katy',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		},
		{
			name: 'Chuck',
			computer: {
				OS: 'OSX',
				type: 'macbook'
			}
		}

	],
	preReqs : {
		skills : ['html', 'css', 'git'],
		equipment: {
			laptop: true,
			OSOptions: ['linux', 'osx']
		}
	}
};

console.log("name of course: " + course.name); //1. 
console.log("name of second teacher: " + course.teachers[1]); //2. 
console.log("name of first student: " + course.students[0].name); //3.
console.log("Katy's computer type: " + course.students[1].computer.type); //4. 
console.log(course.preReqs.equipment);//5.
console.log("the second OSOption from equipment prereqs: " +course.preReqs.equipment.OSOptions[1]); //6.
console.log("string of OSOptions: " + course.preReqs.equipment.OSOptions.join(' or ')); //7.
students = course.students
//console.log(students);
let osx_students = []
//8.
for (let i = 0; i < course.students.length; i++ ){
    if (course.students[i].computer.OS == 'OSX'){
        console.log(course.students[i]);
        osx_students.push(course.students[i]);
    }
}



function useMyCourse( course){

}
useMyCourse(course);


// //Value types
// let x = 1;
// // let y = 1;
// // x === y; //true

// // let y = x; 	// x == 1, y == 1
// // x === y; 	// true

// x = 2; 		// x == 2, y == 1
// x === y; 	// false
//Reference types
let x = {name: 'Evan'}
//let y = {name: 'Evan'}
 //x === y; //false;

  let y = x; 		//x and y are {name: 'Evan'} y = 0x001A0430, x = 0x001A0430
  x === y;		//true

//  x.name = 'Noah'
//  y.name; // 'Noah'

let matt = {name: 'matt'};
let julian = {name: 'julian'};
let students = [matt,julian];// 0x001A0430 (matt), 0x34AB8321 (julian)

students.indexOf(julian); //1 
students.indexOf({name:'julian'}); //-1 (meaning nothing was found)