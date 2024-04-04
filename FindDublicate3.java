package com.arr.array;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//O(n)
public class FindDublicate3 {
    public static void printArr(List<Integer> e) {
        // for (int ele : e) {
        // System.out.println(ele);
        // }
        List<Integer> collect = e.stream().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void findDublicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!seen.add(arr[i]) /* == false */) {

                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 111, 333, 555, 777, 333, 444, 555 };
        findDublicate(arr);
    }
}
