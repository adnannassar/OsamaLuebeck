package Datastructure.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      testMyStack();
    }

    void testJavaStack(){
        // LIFO Last in First out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    static void testMyStack() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
