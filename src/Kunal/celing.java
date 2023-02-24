//package Kunal;
//
//import java.util.Scanner;
//
//public class celing {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println("Enter number");
//        int target = in.nextInt();
//        int[] newarr = new int[n];
//        System.out.println("Enter number");
//        for(int i=0;i<n ; i++){
//                newarr[i] = in.nextInt();
//        }
//        System.out.println(smallestofgreatestNum(newarr , target));
//    }
//    public static int smallestofgreatestNum(int[] newarr ,int target){
//        int ans;
//        int start = 0;
//        int end = newarr.length;
//        while (start < end){
//            int mid = start + (end - start)/2;
//            if(newarr[mid] == target){
//                ans = mid;
//            }
//            else if(newarr[mid] > target){
//                end = mid -1;
//            }
//            else{
//                start = mid -1;
//            }
//        }
//
//        return ans;
//    }
//}
