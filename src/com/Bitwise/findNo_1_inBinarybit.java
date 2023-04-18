package com.Bitwise;

public class findNo_1_inBinarybit {
    public static void main(String[] args) {
        int  n  = 11110;
//        int count=0;
//        while(n > 0) {
//            if ((n & 1) != 0) {
//                count++;
//            }
//            n = n >> 1;
//        }
        int count=0;
        while(n!=0){
            n=n &(n-1);
            count++;
        }
//        return count;
        System.out.println(count);
    }
}
