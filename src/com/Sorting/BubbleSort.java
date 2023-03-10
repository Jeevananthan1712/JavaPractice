package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,6,6,5,4};
        for(int i=0;i<=arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
//        int maxcount = 0;
//        int k=0;
//        for(int i=0;i< arr.length;i++){
//            int count=0;
//            for(int j=0;j< arr.length;j++){
//                if(arr[i] == arr[j])
//                    count++;
//                if(maxcount < count){
//                    maxcount = count;
//                     k = arr[i];
//                }
//            }
//        }
//        System.out.println(k);
    }
}
