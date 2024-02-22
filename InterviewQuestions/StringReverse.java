package com.InterviewQuestions;

public class StringReverse {

    public static void main(String[] args){

        String s = "sudhakar";
        String s1 = " royal";
        String s2 = s+s1;
        System.out.println(s2);
        //System.out.println("Add Two Strings : "+s.concat(s1));
        StringBuilder sb = new StringBuilder(s2);
        System.out.println(sb.reverse());
    }
}
