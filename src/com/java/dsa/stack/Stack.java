package com.java.dsa.stack;

public class Stack {
    int[] arr;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }
    public void push(int data){
        if(top == size - 1){
            System.out.println("Stack OverFlow");
            return;
        }
        arr[++top] = data;
        size++;
    }
    public  void pop(){
        if (top == -1){
            System.out.println("Stack UnderFlow");
            return;
        }
        top--;
        size--;
    }
    public void peek(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top : " + arr[top]);
    }
    public void isEmpty(){
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not Empty");
    }
    public void display(){
        System.out.printf("%s","-----\n");
        for (int i = top; i >= 0; i--) {
            System.out.printf("%s %d %s","|",arr[i],"|\n");
            System.out.printf("%s","-----\n");
        }

    }

}
