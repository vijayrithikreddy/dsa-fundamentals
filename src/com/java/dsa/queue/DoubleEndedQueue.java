package com.java.dsa.queue;

public class DoubleEndedQueue {
    private int[] queue;
    private int front = -1;
    private int rear = -1;
    private int size;

    public DoubleEndedQueue(int size) {
        queue = new int[size];
        this.size = size;
    }

    public void insertFront(int data){
        if ((rear + 1) % size == front){
            System.out.println("queue is full");
            return;
        }
        if (front == -1){
            front = 0;
            rear = 0;
        } else if (front == 0){
            front = size - 1;
        } else {
            front--;
        }
        queue[front] = data;
    }
    public void insertRear(int data){
        if ((rear + 1) % size == front){
            System.out.println("Queue is full");
            return;
        }

        if (rear == -1){
            front = 0;
            rear = 0;
        } else {
        rear = (rear + 1) % size;
        }
        queue[rear] = data;
    }
    public void deleteFront(){
        if (front == -1){
            System.out.println("Queue is  empty");
            return;
        }
        System.out.println("removed : " + queue[front]);
        if (front ==  rear){
            front = -1;
            rear = -1;
        }else {
            front = (front + 1) % size;
        }
    }
    public void deleteRear(){
        if (front == -1){
            System.out.println("Queue is  empty");
            return;
        }
        System.out.println("removed : " + queue[rear]);
        if (front ==  rear){
            front = -1;
            rear = -1;
        }else if (rear == 0){
            rear = size -1;
        } else {
            rear--;
        }
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
