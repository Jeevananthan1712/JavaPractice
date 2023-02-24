package com.functions;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println("n= "+n+"k= "+k);
        System.out.println(swaped(n,k));
    }
    static String swaped(int n,int k){
        int temp = n;
         n=k;
         k=temp;
         return ("n="+n+"k="+k);
    }
}
