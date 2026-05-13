package com.java.dsa.recursion;

import java.util.Scanner;

public class PrintNumbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        print(n);

    }
    public static void print(int n){
        if (n == 0)
            return ;
        print(n - 1);
        System.out.println(n);
    }
}
