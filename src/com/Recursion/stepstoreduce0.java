package com.Recursion;

public class stepstoreduce0 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(18));
    }
    static int numberOfSteps(int num) {
        int count = 0;
        return steps(num,count);

    }
    static int steps(int num,int count){
        if(num == 0){
            return count;
        }
        else if(num%2 == 0){
            num = num/2;
            count++;
        }
        else{
            num = num-1;
            count++;
        }
        return steps(num,count);
    }
}