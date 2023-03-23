package com.Recursion;

public class towPower {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-1));
    }
        static boolean isPowerOfTwo(int n) {
            //    for(int c=0;c<n;c++){
            //        if(Math.pow(2,c) == n){
            //            return true;
            //        }
            //        if(Math.pow(2,c)>n){
            //            return false;
            //        }
            //    }
            //    return false;
            int count =0;
            int x = check(n,count);
            System.out.println(x);
            return x == n;
        }
        static int check(int n,int count){
            System.out.println(count);
            if(n<0){
                return -1;
            }
            if(Math.pow(2,count) == n){
                System.out.println(n);
                return n;
            }
            if(Math.pow(2,count) > n)
                return -1;
            // System.out.println(count);

            return check(n,++count);
        }
    }
