package com.arr.array;

import java.util.Arrays;

public class SwapAjjustNo {
    public static int[] swapArr(int[] arr) {

        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1 && i % 2 == 0) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ar = swapArr(arr);
        System.out.println(Arrays.toString(ar));
    }
}
