package com.oops.inheritance.hieranchial;

//import com.oops.inheritance.single.Childclass;

//import com.oops.inheritance.single.Childclass;

public class Main {
    int n;
    public static void main(String[] args) {
        Childclass cs = new Childclass();
        Childclass2 c = new Childclass2();
        System.out.println("1 "+cs.n);
    }
    Main(){
        this.n = 5;
        System.out.println("2 "+n);
    }
}
