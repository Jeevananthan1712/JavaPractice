package Kunal;

import java.util.Scanner;

public class bitwisefind1timeoccures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int[] arr = {1,2,3,2,1,3,6};
        int count =0;
        for(int i : arr){
            count ^= i;
        }
        System.out.println(count);
    }
}
