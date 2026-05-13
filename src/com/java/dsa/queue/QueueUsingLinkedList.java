package com.java.dsa.queue;

import com.java.dsa.linkedlist.Node;

public class QueueUsingLinkedList {
    private int size;
    private Node front = null;
    private Node rear = null;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if (front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        System.out.println("removed : " + front.data);
        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;
        return val;
    }
    public int peek(){
        if (front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println(front.data);
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
