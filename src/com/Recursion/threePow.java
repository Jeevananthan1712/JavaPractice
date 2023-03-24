package com.Recursion;

public class threePow {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.isPowerOfThree(27);
    }
}
class Solution {
    public void isPowerOfThree(int n) {

        int c=0;
        int x = power(n,c);
        System.out.println(Math.pow(3,x) == n);
    }
    static int power(int n,int c){
        if(n<0){
            return -1;
        }
        if(Math.pow(3,c) == n){
            return c;
        }
        else if(Math.pow(3,c) > n){
            return -1;
        }
        return power(n,++c);

    }
}