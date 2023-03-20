package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxNumFromCurrent {
    public static void main(String[] args) {
       a m = new a();
       int[] arr = {8,4,2,1};
        System.out.println(Arrays.toString(m.smallerNumbersThanCurrent(arr)));
    }
}
class a {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length ;i++){
            int count = 0;
            for(int j = 0 ; j<nums.length; j++){
                if(j != i && nums[j]<nums[i]){
                    count += 1;
                }

            }
            ans[i] = count;
        }
        return ans;
    }
}
