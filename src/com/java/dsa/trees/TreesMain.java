package com.java.dsa.trees;

public class TreesMain {
    static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        TreeNode currentNode = node;
        currentNode.left = new TreeNode(5);
        currentNode.right = new TreeNode(28);

        inOrder(node);
        preOrder(node);
        postOrder(node);
    }
    public static void inOrder(TreeNode root){
        if (root == null)
            return;
        //rule: left-> root -> right
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void preOrder(TreeNode root){
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
