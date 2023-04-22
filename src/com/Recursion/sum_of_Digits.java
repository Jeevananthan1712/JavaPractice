package com.Recursion;

public class sum_of_Digits {
    public static void main(String[] args) {
        System.out.println(sum(1111));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + sum(n / 10));
    }
}
