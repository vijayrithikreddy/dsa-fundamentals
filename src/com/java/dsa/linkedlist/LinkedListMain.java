package com.java.dsa.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    static Node head = null;
    static Node current = null;
    static int size = 0;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int N = sc.nextInt();
        System.out.print("Enter " + N +" numbers : ");
        int temp;
        for (int i = 0; i < N; i++){
             temp = sc.nextInt();
             addNode(temp);
        }
        displayLinkedList();
        insertAtBeginning(10);
        insertAtPosition(2,11);
        insertAtEnd(9);
        displayLinkedList();
        System.out.println("Size : " + size);



    }
    static void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            current = newNode;
        }else {
            current.next = newNode;
            current = newNode;
        }
        size++;
    }

    static void displayLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(current == null){
            current = newNode;
        }
        size++;
    }
    static void insertAtPosition(int position, int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (position == 1){
            insertAtBeginning(data);
            return;
        }
        if(position < 1 || position > size + 1){
            System.out.println("Invalid Position");
            return;
        }

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if(newNode.next == null){
            current = newNode;
        }
        size++;
    }
    static void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            current = newNode;
        } else {
            current.next = newNode;
            current = newNode;
        }
        size++;
    }

}
