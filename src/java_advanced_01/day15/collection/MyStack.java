package java_advanced_01.day15.collection;

import java.util.Stack;

public class MyStack<T> {
    private Stack<T> stack = new Stack<T>();

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }


    public static void main(String[] args) {

    }
}
