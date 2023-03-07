// /*
	

// [
//   ["Batman", "Bruce Wayne"],
//   ["Spiderman", "Peter Parker"],
//   ["The Flash", "Barry Allen"]
// ]
// */

// let superHeroes = 	
// [
//   ["Batman", "Bruce Wayne"],
//   ["Spiderman", "Peter Parker"],
//   ["The Flash", "Barry Allen"]
// ];


// let secretIdentity;

// //secretIdentity = superHeroes.map(); // 1:1 transformation with no callback

// secretIdentity = superHeroes.map(function(revealArray){
//     return (revealArray[0] + " is " + revealArray[1])
// });




// console.log(secretIdentity.join("\n"));



// // let students = [
// // 	{name: 'John Lennon', average: 90},
// // 	{name: 'Ringo Starr', average: 58},
// // 	{name: 'Paul McCartney', average: 82}
// // ];

// console.log(superHeroes.join("\n"));

// chalenge 2
// let players = [
// 	{firstName: 'Cam', lastName: 'Newton', position: 'QB', touchdowns: 32},
// 	{firstName: 'Derek', lastName: 'Anderson', position: 'QB', touchdowns: 0},
// 	{firstName: 'Jonathan', lastName: 'Stewart', position: 'RB', touchdowns: 12},
// 	{firstName: 'Mike', lastName: 'Tolbert', position: 'RB', touchdowns: 8},
// 	{firstName: 'Fozzy', lastName: 'Whittaker', position: 'RB', touchdowns: 3},
// 	{firstName: 'Ted', lastName: 'Ginn', position: 'WR', touchdowns: 9},
// 	{firstName: 'Devin', lastName: 'Funchess', position: 'WR', touchdowns: 2}
// ];

// let mike = players.find(function(object){
//     return object.firstName == 'Mike';
// });

// console.log(mike);

// let rbs = players.filter(function(player_object){
//     if (player_object.position == 'RB') return (player_object); 
    
// });
// console.log(rbs);

// let lastnames = players.map(function(player_object){
//     return `${player_object.lastName}`;
// });

// console.log(lastnames);

// let star_rbs = players.filter(function(player_object){
//     return  (player_object.touchdowns > 5 && player_object.position == 'RB')
// });

// let star_rbs_name = star_rbs.map(function(star_rb){
//     return (star_rb.firstName + " " + star_rb.lastName);

// });

// console.log(star_rbs_name);

// let touchdowns = players.reduce(function(sum, player_object){
//     if (player_object.position == 'RB'){
//         return (sum + player_object.touchdowns);
//         }
// }, 0);

// console.log(touchdowns);

// setTimeout(function(){
// 	console.log('later')
// },5000);

// console.log('now');


// let teacher = {
// 	name: 'Assaf',
// 	sayName: function() {
// 		console.log(this.name);
// 	},
//     failing_students: 4,
//     fullname: this.name + " G" 

// }
// teacher.sayName(); //'Assaf'

// function sayName() {
// 	console.log(this.name);
// }

// let teacher1 = {
// 	name: 'Assaf',
// 	speak: sayName
// }

// let teacher2 = {
// 	name: 'Shane',
// 	speak: sayName
// }

// teacher1.speak(); // 'Assaf'
// teacher2.speak(); // 'Shane'

//sayName();

let teacher = {
	name: 'Shane',
	speak: function() {
		
		//Maybe you're fetching data from an API, or getting user input
		setTimeout(function(){
			console.log('later my name is ' + this.name);
		},1000)
		
		//Runs immediately
		console.log('Now my name is ' + this.name);
	}
}

// teacher.speak();

// let teacher = {
// 	name: 'Shane',
// 	speak: function() {
		
// 		//Save this to a variable
// 		let self = this;
		
// 		//self is visible inside function because of closure
// 		setTimeout(function(){
// 			console.log('later my name is ' + self.name);
// 		},5000);
//         //Runs immediately
//  		console.log('Now my name is ' + this.name);
// 	}
// }

// teacher.speak();

// let slideshow = {
//     photoList: ["picture1_name", "picture2_name"],
//     photoIndex: 0,
//     nextPhoto: function(){
//         if (this.photoIndex = (this.photoList.length) )
//         {
//             console.log("End of slideshow");
//             return;
//             //this.photoIndex = 0;
//         } else{
//             console.log(this.photoList[this.photoIndex]);

//             //this.photoIndex++;
//         }
//         this.photoIndex++;
//     },
//     prevPhoto: function(){
//         if (this.photoIndex = (-1) )
//         {
//             console.log("beginning of slideshow");
// 			this.pause();
//             return;
//             //this.photoIndex = 0;
//         } else{
//             console.log(this.photoList[this.photoIndex]);

//             //this.photoIndex++;
//         }
//         this.photoIndex--;

//     },
// 	getCurrentPhoto: function(){
// 		return this.photoList[this.photoIndex];
// 	},
// 	playInterval: null,
 
//     play: function() {
//         //let self = this;
//         //this.playInterval = setInterval(function(){self.nextPhoto()}, 2000)
// 		let arrowFunction = () => {
// 			this.nextPhoto();
// 		}
// 		this.playInterval = setInterval(arrowFunction,1000)
//     },
 
//     pause: function() {
//         clearInterval(this.playInterval);
//     }
    
// }
// let photoList = 
// // slideshow.nextPhoto();

// let teacher = {name: 'Shane'};

// let speak = function(item1, item2, ...params){
// 	console.log(this.name, item1, item2);
// }

//speak.call(teacher, ); //'Shane', 'coffee', 'ramen'
//speak.apply(teacher, ['coffee', ]); //'Shane', 'coffee', 'ramen'
//speak('coffee', 'ramen')

// let teacher = {
// 	name: 'Shane',
// 	speak: function() {
		
// // 		//Bind a function to a specific context
// 		var boundFunction = function(){
// 			console.log('later my name is ' + this.name);
// 		};
		
// 		//boundFunction will always run in bound context
// 		setTimeout(boundFunction,1000);
// 	}
// }

// teacher.speak();


// let someFunc = function(...params) {
// 	//Some code here
// }
// let someFunc1 = (...params) => {
// 	//Some code here
// }

// someFunc(1, 2, 3);
// someFunc1(1,2,3);

// let teacher = {
// 	name: 'Shane',
// 	speak: function() {
		
// 		//Bind a function to a specific context
// 		var boundFunction = () => {
// 			console.log('later my name is ' + this.name);
// 		};
		
// 		//boundFunction will always run in bound context
// 		setTimeout(boundFunction,1000);
// 	}
// }

// // teacher.speak();
// let students = [
//   { name: "Edwin"}, 
//   { name: "Kim"}, 
//   { name: "Skip"}
// ];

// let names = students.map((student) => student.name);
// let names_withoutarrow = students.map(function(student){
//     return(student.name);
// })

// console.log(names);
// // ["Edwin","Kim","Skip"]

let slideshow = {
    photoList: ['birds', 'puppies', 'rainbows', 'kittens', 'babies'],

    currentPhotoIndex: 0,

    nextPhoto: function() {
        if(this.currentPhotoIndex < this.photoList.length - 1) {
            this.currentPhotoIndex++;
            console.log('currentPhoto is: '+ this.photoList[this.currentPhotoIndex]);
        } else {
            console.log('End of Slideshow');
			this.pause();
        }
    },

    prevPhoto: function() {
        if(this.currentPhotoIndex > 0) {
            this.currentPhotoIndex--;
            console.log('currentPhoto is: ' + this.photoList[this.currentPhotoIndex]);
        } else {
            console.log('Start of Slideshow');
            
        }
    },

    getCurrentPhoto: function() {
        return this.photoList[this.currentPhotoIndex];  
    },

    playInterval: null,

	play: function(){

		//let self = this;

		console.log("is this running");
		let arrow_function = () => {
			this.nextPhoto();
		}
		this.playInterval = setInterval(arrow_function, 1000)

	},
	pause: function(){
		clearInterval(this.playInterval);
	}


}


slideshow.play();
let array = ['list', 'list2'];  //etc to the million entities
array.shift()
// function foo(){
// 	console.log("hi");


let copy = slideshow; //0x0000aaaa = 0x0000\
let num = 1;

console.log(array);
console.log(num)

// }
// foo(); 



    // play: function() {
    //     let self = this;
    //     this.playInterval = setInterval(function(){self.nextPhoto()}, 2000)
    // },

    // pause: function() {
    //     clearInterval(this.playInterval);
    // }


