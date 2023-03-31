package com.Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,4,3,2,1};
        int uni =0;
        for (int a : arr){
            uni ^= a;
        }
        System.out.println(uni);
    }
}
