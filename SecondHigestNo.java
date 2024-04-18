package com.dsa.Array;

public class SecondHigestNo {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 8, 9, 1 };
        int firestMaxNo, secondMaxNo;
        if (arr[0] > arr[1]) {
            firestMaxNo = arr[0];
            secondMaxNo = arr[1];
        } else {
            firestMaxNo = arr[1];
            secondMaxNo = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firestMaxNo) {
                secondMaxNo = firestMaxNo;
                firestMaxNo = arr[i];

            } else if (arr[i] < firestMaxNo && arr[i] > secondMaxNo) {
                secondMaxNo = arr[i];
            }
        }
        System.out.println(secondMaxNo);
    }
}