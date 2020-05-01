package com.company;

public class Main {

    public static void main(String[] args) {
	    StackClass numbers = new StackClass();
		System.out.println("We have an empty stack");
		numbers.show();
		System.out.println("We add three numbers to the stack");
	    numbers.push(1);
	    numbers.push(3);
	    numbers.push(6);
	    numbers.show();
		System.out.println("Peek the last element");
		numbers.peek();
		System.out.println("Pop the top element");
		numbers.pop();
	    numbers.peek();
    }
}
