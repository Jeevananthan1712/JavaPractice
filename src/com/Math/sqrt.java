package com.Math;

public class sqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 2;
        double intvalue = findsqrt(n, p);
        System.out.println(intvalue);
    }

    static double findsqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid > n) {
                end = mid - 1;
            } else if (mid * mid == n) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
//        System.out.println(root);
        double inc = 0.1;
        for (int i = 0; i <= p; i++) {
            while (root * root <= n) {
                root += inc;
//                System.out.println(root);
            }
            root -= inc;
            inc /= 10;
        }

        return root;

    }
}
