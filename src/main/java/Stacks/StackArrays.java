package Stacks;

import java.util.Stack;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = arr[topOfStack];
            topOfStack--;
            System.out.println("Popped value: " + value);
            return value;
        }
    }

    //implement peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = arr[topOfStack];
            System.out.println("Peeked value: " + value);
            return value;
        }
    }

    //implement delete a stack
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is deleted");
    }

    // use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
    public static boolean isPalindrome(String word) {
        StackArrays stack = new StackArrays(word.length());
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append((char) stack.pop());
        }

        return word.equals(reversedWord.toString());
    }

    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();

        stackArrays.pop();
        stackArrays.peek();
        stackArrays.deleteStack();

        String word = "racecar";
        System.out.println("Is '" + word + "' a palindrome? " + StackArrays.isPalindrome(word));
    }
    //Implement a stack datastructure using LinkedList instead of Arrays

}
