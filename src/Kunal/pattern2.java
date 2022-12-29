package Kunal;

import java.util.Scanner;
import java.util.Formatter;

public class pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        numericPatternOne(num);
        pattern(num);


    }

    static void numericPatternOne(int num){
        System.out.println("PatternOne printing...");
        for(int i=1;i<=num;i++){
            int count = 1;
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }
    }
        static void pattern(int n){
            System.out.println();
            System.out.println("pattern2 printing....");
            int count =1;
            if(n%2 != 0){
                for(int i=1;i<=n;i++){
                    if(i%2 != 0){
                        for(int j =1; j<=n;j++){
                            String formattedStr = String.format("%02d", count);
                            System.out.print(formattedStr+" ");
                            count = count+ 1;
                        }
                        System.out.print(" ");

                    }
                    if(i%2 == 0){
                        int x = n/2;
                        int k =1;
                        for(int j=0;j<x;j++){
                            System.out.print("00 ");
                            k+=1;
                        }

                        String formattedStr = String.format("%02d", count);
                        System.out.print(formattedStr+" ");
                        count = count+ 1;

                        for(int m=k;m<n;m++){
                            System.out.print("00 ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else{
                for(int i=1;i<=n;i++){
                    if(i%2 != 0){
                        for(int j =1; j<=n;j++){
                            String formattedStr = String.format("%02d", count);
                            System.out.print(formattedStr+" ");
                            count = count+ 1;
                        }
                        System.out.print(" ");
                    }
                    if(i%2 == 0){
                        int x = n/2 - 1;
                        int k =1;
                        for(int j=0;j<x;j++){
                            System.out.print("00 ");
                            k+=1;
                        }

                        String formattedStr = String.format("%02d", count);
                        System.out.print(formattedStr+" ");
                        count = count+ 1;
                        formattedStr = String.format("%02d", count);
                        System.out.print(formattedStr+" ");
                        count = count+ 1;

                        for(int m=k;m<n-1;m++){
                            System.out.print("00 ");
                        }
                    }
                    System.out.println(" ");
                }
            }
        }
    }

