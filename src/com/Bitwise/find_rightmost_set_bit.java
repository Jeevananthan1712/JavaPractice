package com.Bitwise;

public class find_rightmost_set_bit {
    public static void main(String[] args) {
        int n = 12; // 1100
        int neg_n = ~n+1; //1000 1100 //always 8bit -> leftmost 1 represent negative
        int ans = n & neg_n; // 0100
        System.out.println(ans);
    }
}
