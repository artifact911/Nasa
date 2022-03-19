package dataStructure.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Is stack empty? - " + stack.isEmpty());

        // add elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Is stack empty? - " + stack.isEmpty());
        System.out.println(stack.toString());

        // take the upper one
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println();

        // take the upper one
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());








    }

}
