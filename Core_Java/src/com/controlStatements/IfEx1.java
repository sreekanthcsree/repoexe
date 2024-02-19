package com.controlStatements;

public class IfEx1 {

    int age=60;
    public void hello(){
        if(age>=18 && age>60){
            System.out.println("He/she is eligible for vote and they are elder people");
        } else if (age>=18 && age<=60) {
            System.out.println("He/she is eligible for vote and they are not a elder people");
        }else {
            System.out.println("He/she is not eligible for vote");
        }
    }

    public static void main(String[] args) {
        IfEx1 ex=new IfEx1();
        ex.hello();
    }

}
