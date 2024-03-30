package com.arr.array;

public class SumOfArray {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int sumOfArray = sumOfArray(arr);
        System.out.println(sumOfArray);
    }
}