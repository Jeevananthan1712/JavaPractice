package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrix {
        public static void main(String[] args) {
            int[] arr = {1,2,2,4};
            System.out.println(Arrays.toString(findErrorNums(arr)));
        }
        static int[] findErrorNums(int[] nums) {
            int[] arr = new int[2];
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
                    arr[0] = nums[j];
                    arr[1] = j+1;
                }
            }
            return arr;
        }
        static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

