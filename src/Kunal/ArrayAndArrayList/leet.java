package Kunal.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class leet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            answer[i] = 1;
            if(i==0){
                for(int j=i+1;j<nums.length;j++){
                    answer[i] *= nums[j];
                    // System.out.println(answer[i]);
                }
            }
            else{
                for(int j=i-1;j>=0;j--){
                    answer[i] *= nums[j];
                    // System.out.println(answer[i]+"j");
                }
                for(int k=i+1;k<nums.length;k++){
                    answer[i] *= nums[k];
                    // System.out.println(answer[i]+"k");
                }
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
