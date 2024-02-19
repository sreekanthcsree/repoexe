package com.controlStatements;

public class IfEx3 {

    public static void main(String[] args) {
        int age=23;
        int weight=50;

        if(age>=18) {
            if(weight>45) {
                System.out.println("you are eligible for donate the blood");
            }else {
                System.out.println("you are not eligible for donate the blood");
            }
        }else {
            System.out.println("Age must be greater than 18");
        }
    }
}
