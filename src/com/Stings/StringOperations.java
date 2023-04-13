package com.Stings;

public class StringOperations{
    public static void main(String[] args) {
//        ReverseAString rev = new ReverseAString();
        ReverseAString.reveit();

//        ReverseWord revword = new ReverseWord();
        ReverseWord.revword();
    }
}
class ReverseAString {
    static void reveit() {
                // TODO Auto-generated method stub
                String s="i love java and c";
                int i=0;
                String[] splt=s.split(" ");
                String r="";
                for(i=splt.length-1;i>=0;i--)
                {
                    r=r+splt[i]+" ";
                }
//                r+=splt[i];
//                System.out.println("::"+r.trim());
        System.out.println(r  );
    }
}
class ReverseWord{
    static void revword(){
        String word = "Jane";
        StringBuilder ans = new StringBuilder(" ");
        for(int i = word.length()-1;i>=0;i--){
            ans.append(word.charAt(i));
        }
        System.out.println(ans);
    }

}
