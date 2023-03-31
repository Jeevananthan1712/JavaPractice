package com.Bitwise;

public class sei_ith_bit {
    public static void main(String[] args) {
        int i =4;
        int num = 5;
        int mask = 1<<(i-1);
        int newnum = num & mask;
        System.out.println(newnum);
    }
}
