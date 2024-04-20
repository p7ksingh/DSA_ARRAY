package com.dsa.Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 1, 6, 5, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
