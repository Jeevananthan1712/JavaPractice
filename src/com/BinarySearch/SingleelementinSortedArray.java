package com.BinarySearch;

public class SingleelementinSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        System.out.println(Search(arr));
    }
    static int Search(int[] nums){
        int start = 0;
        int end = start;
        while(start <= end) {
            end = start +1;
            if(nums[start] < nums[end])
                return nums[start];
            if (nums[start] == nums[end]) {
                start += 2;
//                end = start + 1;
            }

        }
        return -1;
    }
}
