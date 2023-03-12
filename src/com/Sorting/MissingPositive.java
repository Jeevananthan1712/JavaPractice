package com.Sorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,1000};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i< nums.length){

            if(nums[i] > 0 && nums[i] < nums.length) {
                int index = nums[i] - 1;
                if (nums[i] != nums[index])
                    swap(nums, i, index);
                else
                    i++;
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j< nums.length;j++){
            if(nums[j] != j+1)
                return j+1;

        }
        return nums.length+1;
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
