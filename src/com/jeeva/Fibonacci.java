package com.jeeva;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fibo = 1;
        int prev =0;
        fibo(fibo,prev,num);

    }
    static int count = 0;

    static void fibo(int fibo,int prev,int num) {
//            System.out.println(prev+"p");
//            System.out.println(fibo);

            int num2 = prev + fibo;
            prev = fibo;
            fibo = num2;
            count++;
        System.out.println(fibo);

        if(count == num){
            return;
        }

        fibo(fibo,prev,num);




    }
}

