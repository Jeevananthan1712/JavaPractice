package com.oops.claass;

import java.util.Scanner;

//import static com.jeevaConditions.fuctions.kiruba;

public class Classandobject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Students details = new Students(13,"jeeva",22.5f);
        Students details1 = new Students(14,"thilak",22.5f);
        Students details2 = new Students(15,"bharath",22.5f);
        Students details3 = new Students(16,"hari",22.5f);
//        Students print = new print();
        details.check(n);
        details2.check(n);
        details1.check(n);
        details3.check(n);


//        kiruba();
//        if(n == details.rollno){
////            System.out.println(details.rollno +","+ details.name);
//            details.print();
//        }
//        if(n == details1.rollno){
////            System.out.println(details2);
//            details.print();
//
//        }if(n == details2.rollno){
////            System.out.println(details1);
//            details.print();
//        }
    }

}

 class Students{
    int rollno;
    String name;
    float mark;

    Students(int rollno,String name,float mark){
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }
   void print(){
//        this.rollno = rollno;
//        this.name = name;
//        this.mark = mark;
        System.out.println(rollno+","+name+","+mark);
    }
    void check(int n){
        if(n == this.rollno ){
                this.print();
        }
    }

}
