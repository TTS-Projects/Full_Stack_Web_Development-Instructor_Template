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

// let a = [1,2,3,4];

// //Slice - doesn't mutate array, slice(start,end)
// a.slice(0,2); //[1,2]
// 'abcd'.slice(1,3) // 'bc'

// //Splice - splice(start,numToRemove,...items to add) - this does mutate
// a.splice(1,2,'a','b'); //a is [1,'a','b',4]

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

let shopping_list = [ 'pop tarts', 'ramen noodles', 'chips', 'salsa','coffee'];
shopping_list.push('fruit loops');
shopping_list[shopping_list.indexOf('coffee')] = 'fair trade coffee';
shopping_list.splice(2,2, 'rice', 'beans')
//shopping_list
shopping_cart = [];
console.log(shopping_list);