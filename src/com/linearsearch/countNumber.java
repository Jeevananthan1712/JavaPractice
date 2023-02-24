package com.linearsearch;

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" element");
            arr[i] = in.nextInt();
        }
        System.out.print("Enter target: ");
        int target = in.nextInt();
        System.out.print(count(arr,target));
    }
    static int count(int[] arr,int target){
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == target)
                count++;
        }
        return count;
    }
}
