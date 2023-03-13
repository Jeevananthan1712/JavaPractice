package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ThreeSum {
    public static void main(String[] args) {
        Ans a = new Ans();
        int[] arr = {3,-2,1,-1,2};
        System.out.println(a.threeSum(arr));
    }
}
class Ans {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        int k = nums.length-1;
        int i=0;
        while(i+1<k){
            if(nums[i] + nums[i+1] + nums[k] == 0){
                l.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[i+1],nums[k])));
                k--;
            }
            else{
                i++;
            }
        }
        return l;
    }
}
