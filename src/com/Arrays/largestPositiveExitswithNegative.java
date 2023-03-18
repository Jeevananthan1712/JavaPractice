package com.Arrays;

import java.util.Arrays;

public class largestPositiveExitswithNegative {
    public static void main(String[] args) {
        int[] nums ={-1,10,6,7,7,1};
        System.out.println(check(nums));
    }
    static int check(int[] nums){
//        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[i] + nums[j] == 0)
                    return nums[i];
            }
        }
        return -1;
    }
}
