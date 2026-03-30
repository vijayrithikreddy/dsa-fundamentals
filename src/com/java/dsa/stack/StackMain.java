package com.java.dsa.stack;

import java.util.Scanner;


public class StackMain {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value : ");
        int n = scanner.nextInt();
        Stack s = new Stack(n);
        System.out.println("Enter " + n + " values :");
        for (int i = 0; i < n; i++){
            s.push(scanner.nextInt());
        }
        s.display();
        s.pop();
        s.display();
        s.peek();
        s.isEmpty();
    }

}
