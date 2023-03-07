package com.Stings;

import org.jetbrains.annotations.NotNull;

public class StringinSubstring {
    public static void main(String[] args) {
        Soltion sol = new Soltion();
        String[] pat = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(sol.numOfStrings(pat,word));
    }

}

class Soltion {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
            for(String x : patterns){
                if(word.contains(x)) {
                    System.out.println(count++);
                }
            }
            return count;
    }
}