package com.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinDiff {
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1};
//        asns s = new asns();
//        System.out.println(s.minimumAbsDifference(arr));

        String s = "WElcome";
        String ns = "";
        String nss = "";
        for(int i=0;i<s.length();i++){
            char j = s.charAt(i);
            if(Character.isUpperCase(j)){
                ns += j;
            }else{
                nss += j;
            }
        }
        String sa = nss+ns;
        System.out.println(sa);


//        Scanner in = new Scanner(System.in);
////        String s = in.nextLine();
//        String s = "jeeva";
//        StringBuilder ans = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            char j =s.charAt(i);
//            if(j == 'a' || j == 'e' || j == 'i' ||j == 'o' ||j == 'u' ){
//                continue;
//            }
//            else{
//                ans.append(j);
//            }
//        }
//        System.out.println(ans);
    }
    }
class asns {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            min=Math.min(min,diff);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min)  {
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}