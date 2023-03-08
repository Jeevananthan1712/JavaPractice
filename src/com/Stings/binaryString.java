package com.Stings;

public class binaryString {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(ss(s));
    }
    static boolean ss(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 1){
                if(s.charAt(i) == s.charAt(i+1)){
                    return true;
                }
            }
        }
        return false;
    }
}
