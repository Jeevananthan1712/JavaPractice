package com.Arrays;

import java.util.Arrays;

public class oddValues {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(increment(m,n,indices));
    }
    static int increment(int m,int n,int[][] indices){
        int count = 0;
        int[][] arr = new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[i].length;j++){
                arr[i][j] += 1;
            }

        }
        System.out.println(Arrays.deepToString(arr));

        return count;
    }
}
