package com.arr.array;

import java.util.Arrays;

public class Reverse1 {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        // int[] result = new int[n];
        // for (int i = 0; i < n; i++) {
        // result[i] = arr[n - i - 1];

        // }
        // return result;

        // by using swap array
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        // for (int rev : revs) {
        // System.out.println(rev);
        // }
    }
}