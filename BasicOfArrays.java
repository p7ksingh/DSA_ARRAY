package com.arr.array;

public class BasicOfArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[0]); // 0
        arr[0] = 1;
        System.out.println(arr[0]);// 1
        char[] cArray = new char[10];
        double[] dArray = new double[10];
        System.out.println(cArray[0]); // null
        System.out.println(dArray[0]);// 0.0
        boolean[] bArray = new boolean[10];
        System.out.println(bArray[1]); // false
    }
}
