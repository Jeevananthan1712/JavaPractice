package com.Stings;

import java.util.Arrays;

public class robotOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        Solutionforrobot sol = new Solutionforrobot();
        System.out.println(sol.judgeCircle(moves));
    }
}
class Solutionforrobot {
    public boolean judgeCircle(String moves) {
    int[] count = new int[2];

    for(int i=0;i<moves.length();i++){
        if(moves.charAt(i) == 'U'){
            count[0] +=1;
        }
        else  if(moves.charAt(i) == 'D'){
            count[0] -= 1;
        }
        else if(moves.charAt(i) == 'L'){
            count[1] -= 1;
        }
        else {
            count[1] +=1;
        }
    }
        System.out.println(Arrays.toString(count));
        return count[0] == 0 && count[1] == 0;

    }
}
