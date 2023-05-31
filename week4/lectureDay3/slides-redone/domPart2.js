//Get a single node
let el = document.getElementById('username');

//Get all inputs
let inputs = document.getElementsByTagName('input');
let inError = document.getElementsByClassName('error');

console.log(inputs.length); //2
console.log(inError.length); //1



let links = document.querySelectorAll('a');

//Works!
let linkCount = links.length;
let firstLink = links[0];

//Doesn't work!
links.forEach(function(link){
	//do something with link
});
