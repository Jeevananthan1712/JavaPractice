package com.Arrays;

import java.util.Arrays;

public class Spirals2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(Buildmatrix(n)));
    }
    static int[][] Buildmatrix(int n){
        int[][] matrix = new int[n][n];
        int count= 1;
        int rowstart = 0 ;
        int rowend = n-1;
        int colstart = 0;
        int colend = n-1;
        while(rowstart <= rowend && colstart<=colend) {
            for (int i = colstart; i <= colend; i++)
                matrix[rowstart][i] = count++;
            rowstart++;

            for(int i=rowstart;i<=rowend;i++)
                matrix[i][colend] = count++;

            colend--;

            if(rowstart <= rowend){
                for(int i=colend;i>=colstart;i--)
                    matrix[rowend][i] = count++;
                rowend--;
            }

            if(colstart <= colend){
                for(int i=rowend;i>=rowstart;i--)
                    matrix[i][colstart] = count++;
                colstart++;
            }
        }


        return matrix;
    }
}
