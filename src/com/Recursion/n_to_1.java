package com.Recursion;

public class n_to_1 {
    public static void main(String[] args) {
//        print(7);
        print_1_to_n(7);
    }

    static void print(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        print(n - 1);
    }

    static void print_1_to_n(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print_1_to_n(n - 1);
        System.out.println(n);
    }
}
