package com.BinarySearch.In2dArray;

import java.util.Arrays;

public class FindANumber {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 2;
        System.out.println(Arrays.toString(binary2d(arr,target)));
    }
    static int[] binary2d(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1; //4
        int[] ans= {-1,-1};
        while(r < arr.length && c >= 0){ //0<4
            if(target == arr[r][c]){
                ans[0] = r;
                ans[1] = c;
                return ans;
            }
            else if(target > arr[r][c]){
                r++;
//                System.out.println(r+"r");
            }
            else{
                c--;
//                System.out.println(c);
            }
        }
        return ans;
    }
}
