package com.operators;

public class UnaryOperatorEx {

    public static void main(String[] args){

        int a=10;
        int b=20;

        System.out.println("Post-increment : "+(a++));//it will print the actual value
        System.out.println("Print the 'a' value incremented by 1:"+a);// a=11
        System.out.println("Pre-increment : "+(++a));//a=12

        System.out.println("--------------------");

        System.out.println("Post-decrement : "+(b--));//print the actual value
        System.out.println(b);//b=19
        System.out.println("Pre-decrement : "+(--b));//b=18

        System.out.println(b++);

        System.out.println("--------------------");

        int hello = ++a + b++; // a=13, b=18+1=> 19
        System.out.println(hello);//o/p : 32

        System.out.println("--------------------");


    }
}
