//package Kunal;
//
//import java.util.Scanner;
//
//public class celing {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number");
//        int target = in.nextInt();
//        int[] newarr = new int[target*target];
//        System.out.println("Enter number");
//        for(int i=0;i<target*target ; i++){
//            int element = in.nextInt();
//            if(element != -1){
//                newarr[i] = element;
//            }else{
//                break;
//            }
//
//        }
//        smallestofgreatestNum(newarr , target);
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
