package com.interviewQuestions;

public class Hello {

    public static String firstKCharacters(String str,int k) {
        if(str==null || str.isEmpty()) {
            return null;
        }
        if(str.length()>k) {
            return str.substring(0,2);

        }else {
            return str;
        }
    }
    public static void main(String[] args) {
        String str="GeeksForHari";
        int k=5;
        System.out.println(firstKCharacters(str,k));
    }
}
