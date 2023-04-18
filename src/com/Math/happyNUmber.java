package com.Math;

public class happyNUmber {
    public static void main(String[] args) {
        int n = 1563712132;
        for (int i = 0; i <= n ; i++) {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                int sqr = temp * temp;
                sum += sqr;
                n = n / 10;
            }
            n = sum;
//            System.out.println(sum);
        }
        System.out.println(n == 1);
    }
}
