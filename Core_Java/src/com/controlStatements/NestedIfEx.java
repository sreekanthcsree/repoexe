package com.controlStatements;

public class NestedIfEx {

    public static void main(String[] args) {

        int telugu=30;
        int maths=40;

        if(telugu>38){
            if(maths>35){
                System.out.println("Passed...!");
            }else{
                System.out.println("Failed in Maths");
            }
        }else{
            System.out.println("Failed in Telugu");
        }
    }
}
