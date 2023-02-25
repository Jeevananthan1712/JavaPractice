package com.BinarySearch;

import java.util.concurrent.CountDownLatch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15,18,32,2,3,4,12};
//        System.out.println(peak(arr));
        int num = peak(arr);
        int count =0;
        for(int i=0;i<=num;i++){
            count +=1;
        }
        System.out.println(count + " rotations");
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){    //0 1 2 3 4 5 6
                return mid;                             //15 18 2 3 4 12
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
