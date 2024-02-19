package com.interviewQuestions;

public class EachWordString {

    public static String revWord(String st) {
        String wo[]=st.split("\\s");
        String revWord="";
        for(String s:wo) {
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            revWord+=sb.toString()+" ";
        }
        return revWord.trim();
    }
    public static void main(String[] args) {
        System.out.println(EachWordString.revWord("OHM SAKTHI"));
        System.out.println(EachWordString.revWord("SRI SAI BABA"));
    }
}
