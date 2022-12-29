package com.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class sumTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }

        sumup(arr);
    }

    static void sumup(int[] arr){

        int[] temp = new int[arr.length-1];

        if(arr.length-1 < 1)
            return;

        for(int i=0;i<arr.length-1;i++){
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }

        sumup(temp);

        System.out.println(Arrays.toString(temp));
    }
}
