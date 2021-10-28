package com.perez;

public class Main {

    public static void main(String[] args) {

        // construct stack from char array
        Character[] letters = {'C', 'A', 'T'};
        Stack<Character> stack = new Stack<>(letters);
        stack.push('R');
        stack.showStack();
        char ch = stack.pop();
        System.out.println(ch);
        stack.push('R');
        stack.showStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showStack();
        stack.swap(1,2);
        stack.swap(-1, 2);

    }
}
