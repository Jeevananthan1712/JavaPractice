package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("enter string");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int count=0;
//        String n = "()";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '(' || n.charAt(i) == '[' || n.charAt(i) == '{'){
                stack.push(n.charAt(i));
            }
            else{
                if((stack.isEmpty())){
                    System.out.println("false");
                }
                else{
                    char popped = stack.pop();
                     if((n.charAt(i) == ')' && popped == '(') || (n.charAt(i) == ']' && popped == '[') ||(n.charAt(i) == '}' && popped == '{')){
//                        stack.pop();
//                        System.out.println("true");
//                         continue;
                         count +=1;
                    }

                     else{
                         System.out.println("false");
                     }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empted ---->maybe balanced");
            System.out.println(count);
        }
        else {
            System.out.println("Not empted -----> Not balanced");
        }
    }
}
