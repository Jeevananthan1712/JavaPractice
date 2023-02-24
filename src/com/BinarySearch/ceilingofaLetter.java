package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ceilingofaLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = {'c','f','j'};
        char target = 'k';
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    System.out.print(search(arr,target));
}
    static char search(char[] arr,char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if(target > arr[arr.length-1]){
                return arr[0];
            }
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid+1];
            }
        }
        return arr[start];
    }
}

