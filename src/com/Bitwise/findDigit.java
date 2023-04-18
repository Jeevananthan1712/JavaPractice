package com.Bitwise;

public class findDigit {
    public static void main(String[] args) {
        int n = 8;
        int base = 2;  //10 -> Decimal NUmbers , 2->Binary numbers
        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);
//        System.out.println(ans == 1);
    }
}
