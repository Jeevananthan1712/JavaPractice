package com.Sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0};
        lution a = new lution();
        System.out.println(a.heightChecker(arr));
    }
}
class lution {
    public int heightChecker(int[] heights) {

        int count =0;
        int ncount =0;
        int[] arr = new int[heights.length];
        System.arraycopy(heights, 0, arr, 0, heights.length);
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i] != heights[i])
                count++;
            else
                ncount++;
        }
//        System.out.println(ncount);
        return count;
    }
}