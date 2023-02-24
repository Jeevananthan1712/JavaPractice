package com.BinarySearch;

public class findinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(peak(arr,target));
    }
    static int peak(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {
                start= mid+1;
            }
        }
        return start;
    }
}
