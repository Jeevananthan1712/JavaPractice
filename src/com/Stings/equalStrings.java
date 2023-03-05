package com.Stings;

public class equalStrings {
    public static void main(String[] args) {
        String[] arr1= {"ab","c"};
        String[] arr2= {"a","bc"};
        Solution sol = new Solution();
        System.out.println(sol.arrayStringsAreEqual(arr1,arr2));
    }

}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1= "";
        String s2 = "";
        for(int i=0;i<word1.length;i++){
            s1 += word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s2 += word2[i];
        }
        if(s1.equals(s2))
            return true;
        return false;
    }
}