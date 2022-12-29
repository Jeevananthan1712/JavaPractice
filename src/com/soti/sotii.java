//package com.soti;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class sotii {
//    public static void main(String[] args) {
//        int[][] grid = new int[3][3];
//        Scanner in = new Scanner(System.in);
////        grid = [[2,1,1],[1,1,0],[0,1,1]]
//        for(int i =0;i<3;i++){
//            for(int j = 0;j<3;j++){
//                grid[i][j] = in.nextInt();
//            }
//        }
//        rotten(grid);
//
//    }
//    static int rotten(int[][] grid){
//        if(grid.length == 0)
//            return 0;
//        Queue<int[]> queue = new LinkedList<>();
//
//        for(int i =0;i<3;i++){
//            for(int j =0;j<3;j++){
//                if(grid[i][j] == 2)
//                    queue.offer(new int[]{i,j});
//            }
//        }
//    }
//}
