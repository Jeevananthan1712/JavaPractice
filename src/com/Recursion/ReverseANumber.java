package com.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        rev(0, 33312);
    }

    static void rev(int sum, int n) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        int temp = n % 10;
        sum = sum * 10 + temp;
        rev(sum, n / 10);
    }
}
