package com.functions;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        rotate(arr);
    }
    static void rotate(int[] arr){
        int[] arr2 = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[n-1];
            n--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
