package com.Bitwise;

public class findNis_2pow {
    public static void main(String[] args) {
        int n= 32 ;
        System.out.println((n & n-1) == 0);
        System.out.println(Integer.toBinaryString(n));
    }
}
