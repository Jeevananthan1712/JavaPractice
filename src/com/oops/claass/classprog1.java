package com.oops.claass;

import java.util.Scanner;

public class classprog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int id = in.nextInt();
        double ph = in.nextDouble();
        int count=0;
        double j =ph;
        for(int i=0;i<100;i++){
            j = j/10;
            if(j == 0){
                break;
            }
//            System.out.println(count);
            count+=1;
        }
//        if(count > 10){
//            System.out.println("ENTER 10 DIGIT NUMBER");
//            ph = in.nextDouble();
//        }
            Emp emps = new Emp(name, id, ph);
            boolean conf = emps.print();
            if(conf){
                
            }

    }
}
class Emp{
    Scanner in = new Scanner(System.in);
    String name;
    int id;
    double ph;

    Emp(String name,int id,double ph){
        this.name = name;
        this.id = id;
        this.ph = ph;
    }
    boolean print(){
        System.out.println(name +","+ id +","+ ph );
        System.out.println("IS IT CORRECT");
        String ans = in.nextLine();
        if(ans.equals("yes")){
            return true;
        }
        return false;
    }


}
