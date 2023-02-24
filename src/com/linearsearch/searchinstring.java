package com.linearsearch;

public class searchinstring {
    public static void main(String[] args) {
        String str ="Jeeva";
        if(str.length() == 0){
            System.out.println("0");
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a')
                System.out.println(i);

        }
    }
}
