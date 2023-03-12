package com.Sorting;

import com.functions.swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// used for [1,N] range
public class cyclicsort {
    public static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1,};
//        int i=0;
//        while(i<arr.length){
//            int index = arr[i] - 1;
//            if (arr[i] != arr[index]) {
//                swap(arr,i,index);
//            }
//            else
//                i++;
//        }
//        System.out.println(Arrays.toString(arr));

        //used for [0,N]range
        int[] arr = {6,5,4,3,2,1,0};
        int i=0;
        while(i<arr.length){
            int index = arr[i] ;
            if (arr[i] != arr[index]) {
                swap(arr,i,index);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
