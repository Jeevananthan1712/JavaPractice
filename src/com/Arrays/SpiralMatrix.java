package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(sol.spiralOrder(matrix));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rowstart = 0;
        int rowend = matrix.length-1;
        int colstat = 0;
        int colend = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(rowstart <= rowend && colstat<=colend){

            for(int i=colstat;i<=colend;i++)
                list.add(matrix[rowstart][i]);
            rowstart++;

            for(int i=rowstart;i<=rowend;i++)
                list.add(matrix[i][colend]);
            colend--;

            if(rowstart <= rowend){
                for(int i=colend;i>=colstat;i--)
                    list.add(matrix[rowend][i]);
                rowend--;
            }

            if(colstat <= colend){
                for(int i=rowend;i>=rowstart;i--)
                    list.add(matrix[i][colstat]);
                colstat++;
            }

        }
        return list;
    }
}















//
//{       rs {1,2,3,4}rs++                              {0,0,0,0
//        rs {5,6,7,8}         i<col[0].length--         0      0
//           {9,10,11,12}                                0     0
//           {9,10,11,12}                                0,0,0,0

//        re {13,14,15,16}}


//Lets breakdown the code
//1->2->3->4    i<mat[0].length;                                                4>2
//rstart++
//8->12->16     i=mat[0].length; i<mat.length;i++
//mat[0].length--
//15->14->13    i=mat[0].length; i>=0;i--
//9->5          rend >= rstart
