package com.Sorting;

import java.util.ArrayList;
import java.util.List;

class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(findDuplicates(arr));
    }
    static  List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int index = nums[i]-1;
            if(nums[i] != nums[index]){
                swap(nums,i,index);
            }
            else
                i++;
        }
        for(int j=0;j< nums.length;j++) {
            if(nums[j] != j+1) {
                ans.add(nums[j]);
                ans.add(j + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}