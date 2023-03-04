package com.BinarySearch.In2dArray;

public class CountNegativeNumber {
    public static void main() {
        int[][] arr = {
                {4,3,-2,-1},
                {3,2,-1,-1},
                {1,1,-1,-1},
                {-1,-1,-2,-3}};
        System.out.println(CountNumber(arr));
    }
//    static int binarySearch(int[] arr,int row , int cstart, int cend){
//        while(cstart <= cend){
//            int mid = cstart + (cend - cstart)/2;
//            if(arr[row][mid] > )
//        }
//    }
    static int CountNumber(int[][] grid){
        int rows = grid.length;
        int cols= grid[0].length;
        int count =0;

        if(cols == 1){
            if (grid[rows-1][cols-1] <0)
                return ++count;
        }

        int cstart = 0;
        int cend = cols -1;
        int rstart = 0;
        int rend = rows-1;
//        while(rstart <= rend){
            while(cstart <= cend && rstart <= rend) {
                int mid = cstart + (cend - cstart) / 2;
                if(grid[rstart][cend] >= 0){
                    rstart++;
                }
                else if (grid[rstart][mid] >= 0) {
                    cstart = mid + 1;
                }
                else if (grid[rstart][mid] < 0) {
                    for (int i = mid; i <= cend; i++) {
                        count++;
                        System.out.println(grid[rstart][i]);
                    }
                    if (mid > 0 && grid[rstart][mid - 1] < 0) {
                        cend = mid - 1;
                    } else {
                       rstart++;
                       cstart = 0;
                       cend = cols-1;
                    }

                }else {
                    rstart++;
                    cstart = 0;
                    cend = cols-1;
                }

//            }
//            rstart++;
        }
        return count;
    }
}
