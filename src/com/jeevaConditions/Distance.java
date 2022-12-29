package com.jeevaConditions;

import java.util.Scanner;

public class Distance {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Form temp to point a");
//        int a = in.nextInt();
//        System.out.println("from temp to point b");
//        int b = in.nextInt();
//        int distance = 0;
//        if(a>b){
//             distance = a - b ;
//        }
//        else {
//             distance = b - a;
//        }
//        System.out.println("From point a to point b"+distance);
//    }
//}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1= in.nextInt();
        double y1 = in.nextInt();
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(distance);
    }
}
