package com.jeevaConditions;

import java.util.Scanner;

//Discount = Listed Price × Discount Rate
//        Rate of Discount = Discount% = (Discount/Listed Price) ×100
//        Selling Price = Listed Price [(100−discount%)/100]
//        Listed Price = (Selling Price × 100)/(100−discount%)
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price");
        double ListedPrice = in.nextInt();
        System.out.println("Enter the Discounted value in value");
        double discount = in.nextInt();
        double dis = (discount/ListedPrice)*100d;
        System.out.println("dis  : "+dis + "%");
        double sp = ListedPrice*((100-dis)/100d);

        System.out.println(sp+"Rs");


    }
}
