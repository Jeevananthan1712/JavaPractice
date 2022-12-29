package com.jeeva;

import java.util.Scanner;

public class Greetingname {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = in.next();
        char charname = name.charAt(0);
        if(charname == 'j'){
            System.out.println("your name is "+ name);
            System.out.println("HEY bruh u r the best");
        }
        else
            System.out.println("your name is "+ name);
    }
}
