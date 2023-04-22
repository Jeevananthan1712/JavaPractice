package com.Recursion;

public class rotatedBS {
    public static void main(String[] args) {
        int[] arr= {6,1,2,3,4};
        System.out.println(findindex(arr,5,0,arr.length-1));
    }
    static int findindex(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(arr[s] < target &&  target < arr[mid])
                e = mid-1;
            else{
                s = mid+1;
            }
        }
        else if(arr[mid] > target && target < arr[e] )
                s = mid+1;
        else
            e = mid-1;
        return findindex(arr, target, s, e);
    }
}
