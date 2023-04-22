package com.Recursion;

import java.util.ArrayList;

public class linearSearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 5, 23, 5, 5, 6};
        int target = 5;
        System.out.println("1st index" + findele(arr, target, 0));
        System.out.println("last index " + findelelast(arr, target, arr.length - 1));
        System.out.println("ALL index " + findallindex(arr, target, 0));

    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findallindex(arr, target, index + 1);
    }

    static int findele(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return arr[index] == target ? index : 0;
        }
        if (arr[index] == target)
            return index;
        return findele(arr, target, index + 1);
//        return (arr[index] == target ? index : 0) || (findele(arr, target, index+1));
    }

    //findlast
    static int findelelast(int[] arr, int target, int index) {
        if (index == 0) {
            return arr[index] == target ? index : 0;
        }
        if (arr[index] == target)
            return index;
        return findelelast(arr, target, index - 1);
//        return (arr[index] == target ? index : 0) || (findele(arr, target, index+1));
    }
}
