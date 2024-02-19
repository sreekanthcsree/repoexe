package com.interviewQuestions;

public class StringReverseExample {

    String str="Ashwatha";
    public static void reverse(String name) {
        char ch[]=name.toCharArray();
        String rev=" ";
        for(int i=0;i<ch.length;i++) {
            rev=ch[i]+rev;
        }
        System.out.println(rev);
    }
    public static void reverseTwo(String name) {
        char ch[]=name.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--) {
            rev=rev+ch[i];
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        reverse("sree hai");reverseTwo("meramma");
        StringBuilder br= new StringBuilder();
    }
}
