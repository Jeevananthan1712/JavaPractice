package com.Arrays;

public class maxproduct {
    public static void main(String[] args) {
        anss ans = new anss();
        int[] arr = {3,4,5,1};
        System.out.println(ans.maxProduct(arr));
    }
}
class anss {
    public int maxProduct(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            for(int j=1;j< nums.length;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    // System.out.println(Arrays.toString(nums));
                }
            }
        }
        int ans = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return ans;

    }

}
