package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//448
public class DisappiredNumber {
    public static void main(String[] args) {
        Solutn sol = new Solutn();
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(arr));

    }
}
class Solutn {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums,i,index);
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                l.add(j+1);
            }
        }
        System.out.println(Arrays.toString(nums));


        return l;
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
