package com.java.dsa.queue;

import com.java.dsa.stack.Stack;

import java.util.Scanner;

public class QueueImpl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("8. Reverse");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    queue.enqueue(val);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    int p = queue.peek();
                    if (p != -1)
                        System.out.println("Front element: " + p);
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    if (queue.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Queue is not empty");
                    break;

                case 6:
                    if (queue.isFull())
                        System.out.println("Queue is full");
                    else
                        System.out.println("Queue is not full");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 8:
                    reverse(queue);
                    break;


                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void reverse(Queue queue) {
        Stack stack = new Stack(queue.length()); // or queue size

        while (!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
    }
}