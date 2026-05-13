package com.java.dsa.queue;

public class CircularQueue {
    private int[] queue;
    private int front = -1;
    private int rear = -1;
    private int size;
    public CircularQueue(int size) {
        queue = new int[size];
        this.size = size;
    }

    public void enqueue(int data){
        if ((rear + 1) % size == front){
            System.out.println("Queue is full");
        }
        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public void dequeue(){
        if (front == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("removed : " + queue[front]);
        if (rear == front){
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

    }
    public int peek(){
        System.out.println(queue[front]);
        return queue[front];
    }
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public void display(){
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (i != rear){
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        if (i == rear)
            System.out.println(queue[i]);
    }
}
