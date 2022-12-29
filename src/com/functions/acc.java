package com.functions;

import java.util.*;

public class acc
{
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=10;
        a=(b+a)&c;

        if((b-5)<(5-b)){
            b=(10+6)+a;
        }
        if(a<b && (b+c)>(a-b)){
            a=(1+7)+a;
        }
        else {
            a=b&c;
        }
        System.out.println(a+b+c);
    }
}