package com.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class numberSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,20};
        int target = 19;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            System.out.print("Enter "+i+" element");
//            arr[i] = in.nextInt();
//        }
//        System.out.print("Enter target: ");
//        int target = in.nextInt();
        System.out.print(search(arr,target));
    }
    static int search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                System.out.println("t<m");
                end = mid -1;
            } else if (target > arr[mid]) {
                System.out.println("t>m");
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
}
