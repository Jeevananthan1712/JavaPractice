package com.Recursion;

import java.util.Scanner;

public class Firstuppercase {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String n = in.nextLine();
        char x = uppercase(n,0);
        if(x == 0){
            System.out.println("NoUpper");
        }
        else
            System.out.println(x);
    }
    static char uppercase(String n,int i){
        if(n.charAt(i) == '\0'){
            return 0;
        }
        if(Character.isUpperCase(n.charAt(i))){
            return n.charAt(i);
        }
        return uppercase(n,i+1);
    }
}
