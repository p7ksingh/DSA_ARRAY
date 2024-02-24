package com.arr.array;

public class SelectionShort1 {
    public static void selectionShort(int[] arr) {
        int n = arr.length;
        // step 1: position of ith elements
        for (int i = 0; i < n - 1; i++) {
            // step 2: min element in array
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 3, 9, 0, 1, 2 };
        selectionShort(arr);

        printArray(arr);
    }
}
