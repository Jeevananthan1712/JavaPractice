package com.functions;

public class overloading {
    public static void main(String[] args) {
        int j=4;
        int k=6;
        fun(k);
        fun(j,k);
        fun("jss","das",23,32,3,2,4,2,2,3,23,2323);
    }
    static void fun(int k){
        System.out.println("single");
    }
    static void fun(int k,int j){
        System.out.println("double");
    }
    static void fun(String k ,String j,int ...v){
        System.out.println("triple");
    }

}
