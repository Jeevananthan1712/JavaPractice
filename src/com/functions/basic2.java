package com.functions;

import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(add(n,k));
    }
      static int add(int n,int k){
        int s = n+k;
        System.out.println(sub(n,k,s));
        return s;
    }
    static int sub(int n,int k,int s){
        return -1;
    }
}
