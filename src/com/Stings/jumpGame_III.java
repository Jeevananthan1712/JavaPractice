package com.Stings;

public class jumpGame_III {
    public static void main(String[] args) {
        String s = "0000000000";
        int minjump = 2;
        int maxjump = 5;
        System.out.println(jumpgame(s,minjump,maxjump));
    }

    static boolean jumpgame(String s,int minjump,int maxjump){
        int i=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j) == '0'){
                    if((i + minjump) <= j && j<= Math.min(i + maxjump, s.length() - 1)){
                        i =j;
                    }
                }
           }
        return i == s.length()-1;

    }
}
