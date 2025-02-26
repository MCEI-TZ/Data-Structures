package main;

import java.util.Stack;

public class DataStructure_Stack {
    public static void main(String[] args) {
        //***** DataStructure Stack ********************************
        Stack<Integer> stack = new Stack<>();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the stack
        stack.forEach(System.out::println);

        // Access the top element of the stack
        System.out.println("Top element: " + stack.peek());

        // Remove the top element of the stack
        stack.pop();

        // Print the updated stack
        System.out.println("After pop element: " + stack);
    }
}
