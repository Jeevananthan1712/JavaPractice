package com.BinarySearch;

public class PositionofEleInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,900};
        int target  = 10 ;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int start =0;
        int end  = 1;
        while(start <= end){
        if(target<= arr[end]){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    System.out.println("t<m");
                    end = mid -1;
                } else if (target > arr[mid]) {
                    System.out.println("t>m");
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
        else {
            start = end+1;
            end = start*2 ;

        }
    }
        return -1;
    }
}
