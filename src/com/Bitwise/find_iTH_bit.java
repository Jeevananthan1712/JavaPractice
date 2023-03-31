package com.Bitwise;

public class find_iTH_bit {
    public static void main(String[] args) {
        int i =1;
        int num = 5;
        int mask = 1<<(i-1);
        int newnum = num & mask;
        if(newnum > 0 ){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
