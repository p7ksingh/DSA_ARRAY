package com.arr.array;

public class LinearSearch {

    public static int searchInArray(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 11;
        int i = searchInArray(arr, x);
        System.out.println(i);
    }

}
