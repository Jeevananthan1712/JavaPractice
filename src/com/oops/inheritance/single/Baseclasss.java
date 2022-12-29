package com.oops.inheritance.single;

public class Baseclasss extends Main {
    int j;
    int k;
    Baseclasss(){
        super(2,3);
    }
    Baseclasss(int k){
        this.k =-1;
        System.out.println("bc");
        this.j =2;
    }
    Baseclasss(int k,int j){
        super(k);
        System.out.println("kj called");
//        super(k,j);
        System.out.println("bca");
    }
}
