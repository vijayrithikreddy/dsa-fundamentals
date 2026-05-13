package com.java.dsa.trees;

import java.util.Scanner;

public class BinarySearchTree {
    static TreeNode root = null;
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insert(data,root);//5
        }
        inOrder(root);
        System.out.println("Enter element to delete: ");
        int data = scanner.nextInt();
        root = delete(data,root);
    }
    public static TreeNode insert(int data,TreeNode root){
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data)
            root.left = insert(data,root.left);
        else
            root.right = insert(data, root.right);
        return  root;
    }
    public static void inOrder(TreeNode root){
        if (root == null)
            return;
        //rule: left-> root -> right
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static TreeNode delete(int data,TreeNode root){
        if (root == null)
            return null;

        if (data < root.data)
             root.left = delete(data,root.left);
        else if (data > root.data)
            root.right = delete(data,root.right);
        else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            int succesor = min(root.right);
            root.data = succesor;
            root.right = delete(succesor,root.right);
        }
        return root;
    }
    public static int min(TreeNode root){
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }
}
