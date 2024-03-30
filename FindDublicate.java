package com.arr.array;

public class FindDublicate {

    public static int getDublicate(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count += 1;
                }
            }
            if (count == 1) {
                return arr[i];
            } else {
                count = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2 };
        int dubleCate = getDublicate(arr);
        System.out.println(" Dublecate " + dubleCate);
    }
}
