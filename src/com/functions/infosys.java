package com.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class infosys {
    public static void main(String[] args) {
        int N =3;
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(1);
        A.add(1);
        A.add(1);
        B.add(1);
        B.add(1);
        B.add(1);

        System.out.println(infosyss(N, A , B));
    }
    static int infosyss(int N ,List<Integer> A, List<Integer> B){
        int count=0;

        for(int i =0 ; i< N ;i++){
                if(Objects.equals(A.get(i), B.get(i))){
                    count = count +1;
                }
        }
        if(count >= N){
            count = count*(count+1)/2;
        }
        return count;
    }
}
