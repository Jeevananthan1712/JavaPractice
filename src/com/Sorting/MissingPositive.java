package com.Sorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,2};
        for(int i=0;i< arr.length;) {
            int index = arr[i]-1;
            if (arr[i] < arr.length-1 && arr[i] != arr[index]) {
                swap(arr,index,i);
                System.out.println(Arrays.toString(arr));
            }
            else
                i++;
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
