package com.jeeva;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(true){
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("%");
            System.out.println("Press x to exit");
            System.out.println("Enter choice");
            char ch = in.next().trim().charAt(0);
//            if (choice > 5) {
//                System.out.println("Retry");
//            }
            if(!(ch == 'x' || ch == 'X')) {
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(num1 + num2);
                        break;
                    case 2:
                        System.out.println(num1 - num2);
                        break;
                    case 3:
                        System.out.println(num1 * num2);
                        break;
                    case 4:
                        System.out.println(num1 / num2);
                        break;
                    case 5:
                        System.out.println(num1 % num2);
                        break;
                    default:
                        System.out.println("nope");
                        break;
                }
            }
            else{
                System.out.println("jeyya");
                break;
                    }

            }
        }


}
