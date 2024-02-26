package com.arr.array;

import java.util.Scanner;

public class LargestAndSmallestEmementInArray {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Arrays");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element at index " + i);
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Largest element in array
    public static int largestElement(int[] arr) {
        int n = arr.length;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }

        }
        return large;
    }

    // smollest element in array
    public static int smallestElement(int[] arr) {
        int n = arr.length;
        int large = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        printArray(arr);
        int largestElement = largestElement(arr);
        int small = smallestElement(arr);
        System.out.println("smallest element: " + small);
        System.out.println("Largest element in Array : " + largestElement);
    }

}
