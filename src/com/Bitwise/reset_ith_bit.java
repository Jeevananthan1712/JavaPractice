package com.Bitwise;

public class reset_ith_bit {
    public static void main(String[] args) {
        int n =15;
        int reset = 2;
        int mask = 1<< reset-1;
        int new_mask = ~mask;
        int new_num = n & new_mask;
//        System.out.println(new_mask);
        System.out.println(new_num);
    }
}
