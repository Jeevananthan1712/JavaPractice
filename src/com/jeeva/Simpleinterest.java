package com.jeeva;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Time : ");
        float time = in.nextFloat();
        System.out.println("Principle: ");
        float principle = in.nextFloat();
        System.out.println("Rate: ");
        int rate = in.nextInt();
        float amount =  (principle*( 1 + rate * time ) );
        System.out.println("Total amount : "+ amount);
    }
}
