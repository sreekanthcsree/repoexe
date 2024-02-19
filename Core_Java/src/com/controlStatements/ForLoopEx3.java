package com.controlStatements;

public class ForLoopEx3 {

    public static void main(String[] args) {
        String [] s= {"Sreekanth","Puspharaj","Raju","Ramlal","Nani","Ajith","Satheesh"};
        System.out.println("Friends Names : ");
        for(String str:s) {
            System.out.println(str);
        }
        System.out.println("-------------------------------------->");
        int [] i= {1234,5678,9012,3456,7890};
        System.out.println("Display the integer values : ");
        for(int it:i) {
            System.out.println(it);
        }
    }
}
