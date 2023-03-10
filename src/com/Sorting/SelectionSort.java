package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2};
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = findmin(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
    static int findmin(int[] arr,int start,int last){
        int max = start;
        for (int i =start;i<=last;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
