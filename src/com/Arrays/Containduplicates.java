package com.Arrays;

import java.util.Arrays;

public class Containduplicates {
    public static void main(String[] args) {
        Solu sol = new Solu();
        int[] arr = {1,2,3,4,1,4};
        System.out.println(sol.containsDuplicate(arr));
    }
}
class Solu {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;

    }
}
