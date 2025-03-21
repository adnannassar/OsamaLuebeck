package Datastructure.Stack;

public class MyStack {
    int[] array = new int[10];
    int last = -1;

    void push(int x) {
        array[++last] = x;
    }

    int pop() {
        int temp = array[last];
        last--;
        return temp;
    }
}
