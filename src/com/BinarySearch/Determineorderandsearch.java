package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Determineorderandsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entter n");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Entter "+ i);
            arr[i] = in.nextInt();
        }
        System.out.println("Entter target");
        int target  = in.nextInt();
        if(arr[0]>arr[n-1]) {
            System.out.println(desen(arr,target));
        }else {
            System.out.println(asen(arr,target));
        }
    }
    static int asen(int[] arr,int target){
        System.out.println("asen");
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
        return -1;
    }
    static int desen(int[] arr,int target){
        System.out.println("desen");
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
