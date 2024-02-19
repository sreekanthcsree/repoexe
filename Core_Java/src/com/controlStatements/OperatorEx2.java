package com.controlStatements;

public class OperatorEx2 {

    public static void main(String args[]){
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10

        System.out.println("------------------------------->");
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        System.out.println(10*10/5+3-1*4/2);//=>10*2+3-1*4/2
                                            // =>20+3-2
                                            //=>23-2=>21  according to BODMAS Rule
    }
}
