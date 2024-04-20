package com.dsa.Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newarr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k++] = arr1[i];
                i++;

            } else {
                newarr[k++] = arr2[j];
                j++;

            }
        }
        while (i < arr1.length) {
            newarr[k++] = arr1[i];
            i++;
        }
        while (j < arr2.length) {
            newarr[k++] = arr2[j];
            j++;
        }

        return newarr;

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 9, 10, 11 };
        int[] arr2 = { 1, 3, 5, 7, 12 };
        int[] newarr = merge(arr1, arr2);
        // for (int dt : newarr) {
        // System.out.println(dt);
        // }
        System.out.println(Arrays.toString(newarr));
    }
}
