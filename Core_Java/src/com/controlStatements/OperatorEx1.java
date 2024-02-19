package com.controlStatements;

public class OperatorEx1 {

    public static void main(String[] args) {
        int x=40;
        int y=30;
        int z=55;

        if(y>x | y>z) {
            System.out.println("x is greater than y and z is greater than y");
        }else if(y>x | y<z) {
            System.out.println("unsatisfied condition");
        }else {
            System.out.println("Sreekanth");
        }
    }
}
