package com.oopsEx;

public class InheritanceTwo extends InheritanceOne {

    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication of two numbers is : " + c);
    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println("Division of two numbers is : " + c);
    }
}