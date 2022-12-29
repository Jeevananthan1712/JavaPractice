package com.stack;

import java.util.Scanner;
import java.util.Stack;
import java.math.*;

public class longestValidparanthesis {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
        String s = "()()(()())(()()())";
        int count=0;
        int max=0;
        int count1=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
                count +=1;
            }
            else if(s.charAt(i) == ')'){
                stack.pop();
                count -=1;
                count1+=1;
            }                max = Math.max(max,count1-1);



//            System.out.print(count);
//            System.out.println(count1);
        }
        if(count == 0){
            // max = count1 -1;
            // max = max -1;
//                max = count1;
//                System.out.print(count1);
            for(int j=1;j<=max;j++){
                System.out.print("()");
            }
//            count1=0;
//            max =0;


        }
//                    System.out.println(count1);

    }
}
