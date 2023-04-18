package com.Bitwise;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] new_image = new int[image.length][image[0].length];
        for(int i =0;i<=image.length-1;i++){
            for(int j = image[i].length-1,k = 0;j>=0;j--,k++){
                    new_image[i][k] = image[i][j]^1;
            }
        }

        return new_image;
    }
}