package com.java.dsa.recursion;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {19,45,234,595,987};
        int low = 0;
        int high = arr.length - 1;
        binarySearch(arr,low,high,595);
    }
    public static void binarySearch(int[] arr, int low, int high, int key){
        if (low >  high) {
            System.out.println(" not found");
            return;
        }
        int mid = low + (high - low)/2;

        if (arr[mid] == key) {
            System.out.println("Found " + key + " at index : " + mid);
            return;
        } else if (arr[mid] > key)
            binarySearch(arr,low,mid-1,key);
        else
            binarySearch(arr,mid + 1,high,key);

    }

}
