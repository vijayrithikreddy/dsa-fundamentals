package com.java.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n;
        n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.println(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }
        

    }
}
