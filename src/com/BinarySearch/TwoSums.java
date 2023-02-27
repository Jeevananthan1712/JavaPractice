package com.BinarySearch;
import java.util.Arrays;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSums {
    public static void main(String[] args) {
        int[] numbers = {2,3,8,13,14};
        int target = 11;
        System.out.println(Arrays.toString(twosum(numbers,target)));
    }
    static int[] twosum(int[] numbers,int target){
        int start = 0;
        int end = numbers.length -1;
        int[] ans = {-1,-1};

        while(start < end){
            if(numbers[start] + numbers[end] == target){
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }
            if(numbers[start] + numbers[end] > target ){
                end--;
            }
            else if(numbers[start] + numbers[end] < target){
                start++;
            }
        }
        return ans;
    }

}
