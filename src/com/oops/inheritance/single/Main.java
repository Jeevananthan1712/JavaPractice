package com.oops.inheritance.single;

public class Main {
    int j;
    int b;
    public static void main(String[] args) {

//        Baseclasss base = new Baseclasss(2);
//        Baseclasss base2 = new Baseclasss(2,3);
        Childclass cs =new Childclass(2,3,4);
    }
    Main(){
        System.out.println("def");
    }
    Main(int k){
        System.out.println("Main one  const called");
    }
    Main(int j,int b){
        System.out.println("Main const called");
        this.j = 2;
        this.b=3;
    }


}
