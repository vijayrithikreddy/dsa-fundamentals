package com.java.dsa.recursion;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N :");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n == 0 || n == 1)
            return n;
        System.out.println(n);
        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
