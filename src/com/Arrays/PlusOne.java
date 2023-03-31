//package com.Arrays;
//
//import java.util.Arrays;
//
//public class PlusOne {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        System.out.println(Arrays.toString(plusOne(arr)));
//    }
//    static int[] plusOne(int[] digits) {
//        int[] arr = new int[digits.length+1];
//        int num = 0;
//        for(int i =0;i<digits.length;i++){
//            num = num*10+ digits[i];
//        }
//        int sum = num +1;
//        for(int i=0;i< digits.length+1;i++){
//            int k = sum /10;
//            arr[i] = k;
//        }
//        return arr;
//    }
//}
//
