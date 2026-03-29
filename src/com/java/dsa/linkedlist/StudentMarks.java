package com.java.dsa.linkedlist;

import java.util.Scanner;

public class StudentMarks {
    static Node head = null;
    static Node current = null;
    static int size = 0;

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " marks : ");
        int temp;
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if (temp < 0 || temp > 100){
                System.out.println("Invalid Input");
                return;
            }else
              addNode(temp);
        }
        int choice;
        boolean exit = false;
        do {
            System.out.println("----------------------------");
            System.out.printf(
                    "1 -> Insert at beginning\n" +
                            "2 -> Insert at position\n" +
                            "3 -> Insert at end\n" +
                            "4 -> Delete at position\n" +
                            "5 -> Display\n" +
                            "6 -> Average\n" +
                            "0 -> Exit\n"
            );
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Marks : ");
                    int m1 = scanner.nextInt();
                    insertAtBeginning(m1);
                    break;
                case 2:
                    System.out.println("Enter positon : ");
                    int position = scanner.nextInt();
                    System.out.println("Enter Marks : ");
                    int m2 = scanner.nextInt();
                    insertAtpositon(position, m2);
                    break;
                case 3:
                    System.out.println("Enter Marks : ");
                    int m3 = scanner.nextInt();
                    insertAtEnd(m3);
                    break;
                case 4:
                    System.out.println("Enter Position :");
                    int deletePosition = scanner.nextInt();
                    deleteAtPosition(deletePosition);
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    display();
                    System.out.println("Average Marks : " + averageMarks());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }while (!exit);

    }
    static void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            current = newNode;
        }
        else {
            current.next = newNode;
            current = newNode;
        }
        size++;
    }
    static void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            current = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    static void insertAtpositon(int position, int data){
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null){
            System.out.print("Invalid Postion");
            return ;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == current) current = newNode;
        size++;
    }
    static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            current = newNode;
        }else {
            current.next = newNode;
            current = newNode;
            size++;
        }
    }
    static void deleteAtPosition(int position){
        Node temp = head;
        for (int i = 1; i < position -1; i++) {
            temp = temp.next;
        }
        if (temp == null){
            System.out.print("Invalid positon");
            return;
        }
        if(temp.next == current) current = temp;
        temp.next = temp.next.next;
        size--;
    }
    static double averageMarks(){
        int sum = 0;
        Node temp = head;
        while(temp != null){
            sum += temp.data;
            temp = temp.next;
        }
        double avg = (double)sum / size;
        return avg;
    }
    static void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
