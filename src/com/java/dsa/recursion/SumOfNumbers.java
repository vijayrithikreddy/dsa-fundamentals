package com.java.dsa.recursion;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if (n == 0)
            return 0;
        return n * sum(n-1);
    }
}
