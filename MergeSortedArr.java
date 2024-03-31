package com.arr.array;

import java.util.Arrays;

public class MergeSortedArr {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] arr3 = new int[n];
        int i = 0, j = 0, k = 0;
        for (k = 0; i < arr1.length && j < arr2.length; k++) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                j++;
            }

        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr1[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 4, 7, 9 };
        int[] arr2 = { 3, 3, 5 };
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}