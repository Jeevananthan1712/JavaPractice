package com.Bitwise;

import java.util.Arrays;

public class countBits {
    public static void main(String[] args) {
        int n =5;
        int[] arr = new int[n+1];
        for(int i = 0;i<=n;i++){
            int count =0;
            int temp = i;
            System.out.println(i);
            while(temp!=0){
                temp = temp & (temp-1);
                count++;

            }
            arr[i] = count;
        }
//        return arr;
        System.out.println(Arrays.toString(arr));
    }
}
