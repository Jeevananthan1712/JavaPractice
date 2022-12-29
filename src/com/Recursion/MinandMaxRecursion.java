package com.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MinandMaxRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }

        MaxandMin(arr);

    }

    static  void MaxandMin(int[] arr){
        int max=0;
        int min =0;
        int count=0;

        if(arr.length-1 < 1)
            return;

        int[] temp = new int[arr.length-1];

            if(max<arr[count]){
                max = arr[count];
                temp[count] =max;
            }
            else{
                min = arr[count];
                temp[count] =min;

            }

            count +=1;
            MaxandMin(temp);

        System.out.println(Arrays.toString(temp));

    }
}
