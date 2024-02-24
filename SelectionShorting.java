package com.arr.array;

public class SelectionShorting {
    public static void shortArray(int[] arr) {
        int n = arr.length;
        // step-1::insert element at ith position
        for (int i = 0; i < n - 1; i++) {
            // step-2::find minimum element in array
            int min = Integer.MAX_VALUE;// infinate
            int minIndex = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // step-3::swap elements at minIndex with ith element

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
        int[] arr = { 4, 1, 5, 2, 3, 0 };
        shortArray(arr);
        printArray(arr);
    }
}
