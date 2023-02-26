package com.BinarySearch;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target =13;
        System.out.println(Arrays.toString(twosum(numbers,target)));
    }
    static int[] twosum(int[] numbers,int target){
        int start = 0;
        int end = numbers.length -1;
        int[] ans = {-1,-1};

        while(start < end){
            int mid = start +(end - start)/2;
            if(numbers[start] + numbers[end] == target){
                ans[0] = start;
                ans[1]= end;
            }
            if(target - numbers[mid] < numbers[mid]){
                end = mid;
            }
            if(target - numbers[mid] > numbers[mid]){
                start = mid+1;
            }
        }
        return ans;
    }

}
