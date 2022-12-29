package com.jeevaConditions;

import java.util.Scanner;
//import static com.jeevaConditions.fuctions.kiruba;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner in = new Scanner(System.in);
        int factnum = in.nextInt();
//        System.out.println("factnum+1  : "+ factnum+1);
        for(int i = 1;i <= factnum ; i++){
        fact = fact * i ;
        System.out.println(fact);
        }
//        kiruba();
    }
}
