package com.Recursion;

public class No_of_zero {
    public static void main(String[] args) {
        System.out.println(findzero(0,3090));
    }
    static int findzero(int count,int n){
        if( n == 0){
            return count;
        }
        if( n % 10 == 0)
            count++;
        return findzero(count,n/10);
    }
}
