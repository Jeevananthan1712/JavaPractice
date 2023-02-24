package com;

import java.util.Arrays;
import java.util.Scanner;

public class mmsa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>0;j--){
                if(arr[i] == arr[j]){
                    arr = removeTheElement(arr,arr[i]);
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans1 = arr[1];
        int ans2= arr[n-2];
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
