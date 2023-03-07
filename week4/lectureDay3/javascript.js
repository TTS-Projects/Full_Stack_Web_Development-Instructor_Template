// //Get a single node
// let el = document.getElementById('header-top');


// //Get all inputs
// let inputs = document.getElementsByTagName('input');
// //let inError = document.getElementsByClassName('error');

// console.log(inputs.length); //2
// //console.log(inError.length); //1


// //queries

// //Get all inputs
// let firstButton = document.querySelector('button');
// let inError = document.querySelectorAll('input.error');

 //console.log(firstButton); //single button node
// console.log(inError); //Node list of inputs with class 'error'

// let links = document.querySelectorAll('a');

// //Works!
// let linkCount = links.length;
// let firstLink = links[0];



// let arrayOfLinks = Array.from(links);


// arrayOfLinks.forEach(function(link){
//     console.log("hi");
// });

// let listItems = document.querySelector('ul').children;
// console.log(listItems.length); //2


// let selectedItem = document.querySelector('ul');
// let array_selected_items = Array.from(selectedItem);

// array_selected_items.forEach(function(item){
//     item = item.nextElementSibling;
//     return(item);

// })
// let nextItem = selectedItem.nextElementSibling;
// let nextNextItem = selectedItem.nextElementSibling;



// let lastItem = selectedItem.nextElementSibling.nextElementSibling;



// let first = selectedItem.previousElementSibling;
// let last = selectedItem.nextElementSibling;
// let list = selectedItem.parentElement;
// let header = selectedItem.parentElement.parentElement;
// let section = selectedItem.parentElement.parentElement.nextElementSibling;`

//Laziness is your friend...
let q = document.querySelector.bind(document)
let qa = document.querySelectorAll.bind(document);


//Get the header element
let header = document.querySelector('header');

let header_1= q('header');
console.log(header);
// Get all the section elements
let sections = document.querySelectorAll('section');

// Get the section element with class="current"
let current_section = document.querySelector('section.current');

// Get the section that comes after the current section
let next_section = current_section.nextElementSibling;
// Get the h2 node from the section before the 'current' section

let h2_node = current_section.previousElementSibling.children[0];
// Get the div that contains the section that has an h2 with a class of 'highlight'
let divider = document.querySelector('h2.hightlight').parentElement.parentElement;
// Get all the sections that contain an H2 (using a single statement);
let all_h2 = Array.from(document.querySelectorAll('section h2'));


let array_h2 = all_h2.map(
    function(headline){
        return headline.parentElement;
    }
);