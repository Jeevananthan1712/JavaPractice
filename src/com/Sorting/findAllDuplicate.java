package com.Sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicate {
    public static void main(String[] args) {
        Solut sol = new Solut();
        int[] arr = {1,2,3,1,2,3};
        System.out.println(sol.findDuplicates(arr));
    }
}

class Solut {
    public List<Integer> findDuplicates(int[] nums) {

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
            if(nums[j] != j+1)
                ans.add(nums[j]);

        }
        return ans;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}