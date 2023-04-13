package com.Bitwise;

public class find_nth_magicNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count =1;
        while(n >  0){
            int ans = n&1;
            sum += ans* Math.pow(5,count++);
            n = n>>1;
        }
        System.out.println(sum);
    }
}
