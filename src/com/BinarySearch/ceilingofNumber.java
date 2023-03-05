//package com.BinarySearch;
//
//import java.util.Scanner;
//
//public class ceilingofNumber {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Entter n");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Entter " + i);
//            arr[i] = in.nextInt();
//        }
//        System.out.println("Entter target");
//        int target = in.nextInt();
//        System.out.println(ceiling(arr, target));
//    }
//    static int ceiling(int[] arr, int target){
//        int[] newarr = new int[arr.length];
//        int count=0;
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] >= target) {
//                newarr[count] = arr[i];
//                count++;
//            }
//        }
//        return newarr[0];
//    }
//}
package com.BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class  ceilingofNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,20};
        int target = 190;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//
        System.out.print(search(arr,target));
    }
    static int search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                System.out.println("t<m");
                end = mid -1;
            } else if (target > arr[mid]) {
                System.out.println("t>m");
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
