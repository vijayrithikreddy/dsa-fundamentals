package com.java.dsa.recursion;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n * Factorial(n-1);
        }
    }
