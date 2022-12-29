package com.jeevaConditions;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        double watts = unit * 1000;
        double cal = watts*(24*30);
        System.out.println(cal);
    }
}
