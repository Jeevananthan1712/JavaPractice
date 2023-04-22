package com.Recursion;

public class factorial {
    public static void main(String[] args) {
        int prod = 1;
        System.out.println(findfactorial(5));
    }

    static int findfactorial(int n) {
        if (n == 1) {
//            System.out.println(prod);
            return 1;
        }
//        prod = prod * n;
//        findfactorial(prod , n-1);
        return n * findfactorial(n - 1);

    }
}
