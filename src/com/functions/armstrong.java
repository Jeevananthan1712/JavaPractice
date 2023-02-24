package com.functions;

import java.util.Objects;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(checkarm(n));
    }
    static boolean checkarm(int n){
        int s=0;
        int m=n;
        while(n>0){
            int r = n%10;
            n = n/10;
            s += r*r*r;
        }
        if(s!=m)
            return false;
        return true;
    }
}
