package Kunal;

//We are going to compare Strings and place them in a order of Dictionary.

import java.util.Scanner;

public class lexicographicallyDictionaryWiseCompareString {
    public static void main(String[] args) {
//        String str1 = "Jeeva bruh";
//        String str2 = "Jeeva Bro";
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int res = str1.compareTo(str2);
        if(res == 0){
            System.out.println("Both r same");
        }else if(res < 0 ){
            System.out.println(str1 + "then" +str2);
        }
        else {
            System.out.println(str2 + " then " +str1);

        }
    }
}
