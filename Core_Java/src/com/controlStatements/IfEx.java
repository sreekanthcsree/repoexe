package com.controlStatements;

public class IfEx {

    int age=20;
    public void voter(){
        if (age>=18){
            System.out.println("He/she is eligible for vote");
        }else{
            System.out.println("He/she is not eligible for vote`");
        }
    }
    public static void main(String[] args){
        IfEx ex=new IfEx();
        ex.voter();
    }
}
