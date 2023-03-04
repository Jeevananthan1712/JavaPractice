package com.BinarySearch.In2dArray;

import java.util.Arrays;

public class SortedarrayFindaNumber {
    public static void main(String[] args) {
         int[][] arr= {
                 {1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}
         };
         int target = 12;
        System.out.println(Arrays.toString(soretedArraySearch(arr,target)));
    }
    static int[] soretedArraySearch(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return BinarySearch(arr, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rend = rows -1;
        int cmid = cols/2;
        while(rstart < (rend -1)){
            int mid = rstart+(rend - rstart)/2;
            if(target == arr[mid][cmid]){
                return new int[]{mid,cmid};
            }
            else if(target < arr[mid][cmid]){
                rend = mid;
            }
            else{
                rstart = mid;
            }
//                                                        {1,2,3,4},
//                                                        {5,6,7,8},
//                                                        {9,10,11,12},
//                                                        {13,14,15,16}
        }
        if(arr[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(arr[rstart+1][cmid] == target){
            return new int[]{rstart+1,cmid};
        }

        if(arr[rstart][cmid-1] >= target){
            return BinarySearch(arr,rstart,0,cmid - 1,target);
        }
        if(arr[rstart][cmid+1] <= target && target <= arr[rstart][cols-1]){
            return BinarySearch(arr,rstart,cmid+1,cols - 1,target);
        }
        if(arr[rstart+1][cmid-1] >= target){
            return BinarySearch(arr,rstart+1,0,cmid - 1,target);
        }

//        (arr[rstart+1][cmid+1] <= target && target <= arr[rstart+1][cols-1])
        else{
            return BinarySearch(arr,rstart+1,cmid+1,cols - 1,target);
        }

    }
    static int[] BinarySearch(int[][] arr , int row,int cstart,int cend,int target){
        while (cstart <= cend){
            int mid = cstart + (cend - cstart)/2;
            if(target == arr[row][mid])
                return new int[]{row,mid};
            else if(target > arr[row][mid]){
                cstart = mid+1;
            }
            else {
                cend = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
