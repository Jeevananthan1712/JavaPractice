package com.Stings;

public class HalvesAlike {
    public static void main(String[] args) {
        String s = "UO";
        System.out.println(Checkhalves(s));
    }
    static boolean Checkhalves(String s){
        int count1=0;
        int count2=0;
        int half = s.length()/2;
        String firsthalf = s.substring(0,half);
        String sechalf = s.substring(half);
        System.out.println(firsthalf);

        for(int i=0;i<half;i++){
            char ch = firsthalf.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == '0'||ch == 'U'){
                count1++;
            }
        }
        for(int i=0;i<half;i++){
            char ch = sechalf.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                count2++;
            }
        }
        return count1 == count2;
    }
}
