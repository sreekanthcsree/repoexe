package com.InterviewQuestions;

public class Sudhakar {

    static int k;

    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        add(10,20);//"we are using method name: "
        Sudhakar.add(20,30);//"we are using class name : "
        System.out.println(Sudhakar.k=30);
        Sudhakar s = new Sudhakar();
        System.out.println( s.k=60);
    }
}
