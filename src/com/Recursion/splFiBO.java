package com.Recursion;

import java.util.Scanner;

//import java.util.*;
import java.lang.*;
//import java.io.*;
public class splFiBO {

    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner in = new Scanner(System.in);

//            int a = in.nextInt();
//            int b = in.nextInt();
            int n = in.nextInt();

            System.out.println(f(n));

        }
        static int f(int n){
            if(n<=1){
                return n;
            }

            return f(n-1) ^ f(n-2);
        }
    }

