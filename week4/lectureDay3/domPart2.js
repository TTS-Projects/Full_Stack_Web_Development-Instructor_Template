// //Get all inputs
// let div = document.querySelector('div');
// let a = document.querySelector('a');

// console.log(a.innerHTML); //"click me"
// console.log(div.innerHTML); //'<a href="#">Click me</a>'

// // a.innerHTML = "Updated link text";
// var a = document.querySelector('a');

// //Get an attribute
// console.log(a.href); //"http://google.com"

// //Set an attribute
// a.name = 'new link name';

// //Add a new attribute
// a.target = "_blank";

// //Remove the first list item
// document.querySelector('.first').remove();

// let newLI = document.createElement('li');
// newLI.innerHTML = "Item 2";

// let list = document.querySelector('ul');
// list.appendChild(newLI); //Insert after item 1


// let coffee = document.querySelector('ul').children[1];

// coffee.textContent = "Fair Trade Coffee";


// document.querySelectorAll('ul')

// let children_of_list = document.querySelector('ul').children;
// children_of_list[3].remove();

// //console.log(list.innerText);
// let list_item = document.createElement('li');
// list_item.textContent = "Cheeze Whiz";
// document.querySelector('ul').appendChild(list_item);


// //4.


// let children_of_list2 = document.querySelector('ul').children;
// while(children_of_list2.length != 0){
//     children_of_list2[0].remove();
// }
// let array_items = ['protein powder', 'muscle milk', 'power bars'];

// while (array_items.length != 0){
//     let item = document.createElement('li')
//     item.textContent = array_items.pop();
//     document.querySelector('ul').appendChild(item);
// }

// document.querySelector('ul').children[1].className = "important";

// console.log(document.querySelector('ul').innerHTML);
// let list_item = document.getElementById('item1');
// console.log(list_item.attributes[0]);

// let el = document.querySelector('#myEl');
// el.addEventListener('click', function(event){
//     console.log(event.target);
//     console.log(event.clientX);
//     console.log(event.clientY);
// 	alert('clicked!');
// })

// //Combine with DOM editing
// el.addEventListener('mouseover', function(event){
// 	el.innerHTML = 'over';
    
// })


function event_handler(e){
    // e represents the event (element that has been clicked)
    console.log(e.target );
    console.log(e.currentTarget );
    //inner, outer
    }
    
document.querySelector('#myEl').addEventListener('click', event_handler )