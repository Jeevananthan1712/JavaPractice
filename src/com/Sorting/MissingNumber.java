package com.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,7,0};
//        Solution sol=new Solution();
//        System.out.println(sol.missingNumber(arr));
    }
}
//class Solution {
//    public int missingNumber(int[] nums) {
//        int n= nums.length;
//        for(int i=0;i<nums.length;i++){
//            int last = nums.length-i-1;
//            int maxIndex = findmin(nums,0,last);
//            int temp = nums[maxIndex];
//            nums[maxIndex] = nums[last];
//            nums[last] = temp;
//        }
//        for(int i=0;i<n;i++){
//            if(n == nums[nums.length-1]){
//                if(i != nums[i]){
//                    return i;
//                }
//            }
//            else
//                return n;
//        }
//        return n;
//    }
//    static int findmin(int[] arr,int start,int last){
//        int max = start;
//        for (int i =start;i<=last;i++){
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//}
