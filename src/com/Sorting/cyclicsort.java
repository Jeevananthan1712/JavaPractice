package com.Sorting;

import com.functions.swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        for(int i=0;i< arr.length;) {
            if (i != arr[i]-1) {
                int index = arr[i] - 1;
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
