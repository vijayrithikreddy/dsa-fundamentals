package com.java.dsa.queue;

import com.java.dsa.stack.Stack;

public class Queue {
    private int[] queue;
    private int front = -1;
    private int rear = -1;
    private int size;

    public Queue(int size) {
        queue = new int[size];
        this.size = size;
    }

    public void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) front = 0; // first element

        queue[++rear] = data;
    }

    public int  dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        System.out.println("Removed: " + queue[front]);
        int val = queue[front];
        front++;

        // reset when empty
        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return val;
    }

    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public int length(){
        return size;
    }

}