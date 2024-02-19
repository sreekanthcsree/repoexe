package com.controlStatements;

public class IfEx2 {
    
    int age=18;
    public void ageHello(){
        if(age<15){
            System.out.println("kid");
        } else if (age>15 && age<=23) {
            System.out.println("Teenager");
        } else if (age>23 && age<=40) {
            System.out.println("Adult");
        } else if (age>40 && age<=60) {
            System.out.println("Old age");
        } else if (age>60) {
            System.out.println("not a live");
        }else{
            System.out.println("your age is greater than 60...!");
        }
    }

    public static void main(String[] args) {
        IfEx2 ex=new IfEx2();
        ex.ageHello();
    }
}
