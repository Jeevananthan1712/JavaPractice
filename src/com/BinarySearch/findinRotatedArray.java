package com.BinarySearch;

public class findinRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,5,5};
        int target = 5;
        System.out.println(peak(arr,target));
    }
    static int peak(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start +(end - start)/2;
            if(mid <end && arr[mid] > arr[mid+1]){    //0 1 2 3 4 5 6
                                                      //15 18 2 3 4 12
                return Search(arr,target,mid);
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return Search(arr,target,mid -1);
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return Search(arr,target);
    }
    static int Search(int[] arr, int target, int peak){
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
        end = arr.length - 1;
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
        return -1;

    }
    static int Search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
        return -1;
    }
}
