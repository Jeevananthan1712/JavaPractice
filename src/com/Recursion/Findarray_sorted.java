package com.Recursion;

public class Findarray_sorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7, 8, 9,2};
        System.out.println(findsorted(0, arr));
    }

    static boolean findsorted(int counter, int[] arr) {
        if (counter == arr.length - 1) {
            return true;
        }
//        if(arr[counter] <= arr[counter+1]) {
//            return findsorted(counter + 1, arr);
//        }
//        else{
//            return false;
//        }
        return arr[counter] <= arr[counter+1] && findsorted(counter+1,arr);
    }
}
