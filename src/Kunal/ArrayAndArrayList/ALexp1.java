package Kunal.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ALexp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
            for(int i=0;i< list.size();i++){
                list.add(in.nextInt());
                if(list.contains(0)){
                    break;
                }
            }
        System.out.println(list);

    }
}
