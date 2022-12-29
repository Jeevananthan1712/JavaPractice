package com.jeevaConditions;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class AverageofN {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int numberofElements = in.nextInt();
//        for(int i =0 ; i<= numberofElements ; i++ ){
//            double numbers = in.nextInt() * 10;
//
//        }
//    }


    public static void main(String[] args) {
        int numbers = 12345;
        int res =0 ;
        int len = 0;
        for(int i = 1 ; i <=5;i++){
            int rem = numbers % 10;
            numbers = numbers/10;
//            System.out.println(numbers);

            res = res + rem;
            len = i;
        }
        System.out.println(res);
        System.out.println(len);
        int cal = res/len;
        System.out.println(cal);

    }
    }

