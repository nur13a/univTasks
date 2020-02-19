package com;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(5);
        stack.push(55);
        stack.push(-9);
        stack.push(2);
        stack.push(4);
        System.out.println(stack + " " + stack1 + " " + stack2);
        System.out.println();
        stack1.push(stack.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack1.push(stack.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack1.push(stack.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack1.push(stack.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack1.push(stack.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        System.out.println();
        stack2.push(stack1.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack2.push(stack1.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack2.push(stack1.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack2.push(stack1.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        stack2.push(stack1.pop());
        System.out.println(stack + " " + stack1 + " " + stack2);
        Stack<Integer> stack3 = new Stack<>();
        while (!stack2.isEmpty()) {
            stack3.push(stack2.pop());
            sum += stack3.peek();
            if (stack3.peek() < min)
                min = stack3.peek();
            else if (stack3.peek() > max) max = stack3.peek();
        }
        System.out.println("Sum of Stack= " + sum);
        System.out.println("Min element= " + min);
        System.out.println("Max element= " + max);
    }
}
