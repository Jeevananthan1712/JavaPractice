package Kunal;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        patterOne(num);
        patternTwo(num);
        pattern3(num);
        System.out.println("End of Line");

    }
    static void patterOne(int num){
        System.out.println("PatternOne Printing...");
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("* ");

            }

            System.out.println();
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }

    static void patternTwo(int num){
        System.out.println("PatternTwo printing...");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }

            System.out.println("");

        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }

    static void pattern3(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }

            System.out.println();

        }
        for(int i=1;i<=num;i++){
            for(int j=num;j>i;j--){
                System.out.print("* ");

            }

            System.out.println();
        }

    }

}
