package com.BinarySearch;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,5,3,1};
        int target =1;
        System.out.println(peak(arr,target));
    }
    static int Search(int[] arr,int target,int peak){
        int start = 0;
        int end = peak;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        start = peak+1;
        end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
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
        return Search(arr,target,start);
    }
}
