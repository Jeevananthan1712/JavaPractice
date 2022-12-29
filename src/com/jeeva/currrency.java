package com.jeeva;

import java.util.Scanner;

public class currrency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rupee = in.nextInt();
        float value = 61.06f;
        float dollar = rupee/value;
        System.out.println(dollar);
    }
}
