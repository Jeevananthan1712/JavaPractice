package com.oops.inheritance.single;

public class Childclass extends Baseclasss {
    int c;
    int m;
    int weight;

    Childclass() {
        super();

        System.out.println("CHILDCLASS CALLED");
    }
    Childclass(int c,int m){
        super(2,3);
        System.out.println("childclass with argment called");
    }

    public Childclass(int size,int height , int weight){
        super(size , height);
        this.weight = weight;
        System.out.println("shw called");
    }
}
