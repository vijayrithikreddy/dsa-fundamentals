package com.java.dsa.recursion;

import java.util.Scanner;

public class ReverseNumber {
    static int reverse = 0;
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = scanner.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        if (n == 0)
            return 0;
        int temp = n % 10;
        reverse = reverse * 10 + temp;
        reverse(n/10);
        return reverse;
    }
}
