package com.Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N:");
        int n = in.nextInt();
        System.out.println("target:");
        int target = in.nextInt();
        System.out.println("Array element:");
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        System.out.println(findele(arr,target,start,end));
    }

    static int findele(int[] arr,int target,int start,int end){
          int mid = start + (end-start)/2;

        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return  findele(arr,target,mid+1,end);
        }
        else{
            return  findele(arr,target,start,mid-1);
        }
    }
}
