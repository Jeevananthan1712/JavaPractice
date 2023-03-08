package com.Arrays;

public class jumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpstarts(nums));
    }
    static boolean jumpstarts(int[] nums){
        int lastindex = nums.length-1;
        if(nums.length == 1)
            return true;
        int jump = 0;
        for(int i=0;i<nums.length;i+=jump){ //i=i+jump
            jump = nums[i]-1;
            int jumpedindex = i+jump;
            if(i == lastindex || jumpedindex >= lastindex)
                return true;
            else if(nums[i] == 0 || jump == 0)
                return false;
        }
        return false;

    }
}
