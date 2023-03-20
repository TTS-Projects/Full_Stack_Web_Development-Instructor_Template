package data_structures;

public class StackExample {

	// Imports the data we need to use the Stack class

	Stack<Integer> myStack; 
	// creates a reference variable for a Stack called myStack
	myStack = new Stack<Integer>(); 
	// creates a new Integer Stack and assigns its address to myStack

	myStack.push(1); 
	// Pushes 1 to the top of our stack
	// myStack now consists of [1]
	myStack.push(2);
	// myStack now consists of [1, 2] 
	myStack.push(3);
	// myStack now consists of [1, 2, 3] 

	// Despite pushing to the "top" of the stack, the printed representation 
	// puts our new numbers at the back. The important part is that they are 
	// removed from the same place they are added.


