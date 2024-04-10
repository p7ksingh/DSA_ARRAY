package com.arr.array;

import java.util.Arrays;

public class SecondHigest {
  public static void main(String[] args) {
    int[] arr = { 9, 10, 11, 12, 4, 3, 8, 1, 5 };
    int high = arr[0];// 4
    int secondHigh = arr[0];// 4
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > high) {
        secondHigh = high;
        high = arr[i];
      } else if (arr[i] < high && arr[i] > secondHigh) {
        secondHigh = arr[i];

      }

    }
    System.out.println(secondHigh);
  }
}
