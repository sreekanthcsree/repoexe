package com.controlStatements;

public class HelloSree {

    public static void main(String[] args) {

        for(int i=1;i<8;i++){
            for(int j=1;j<8;j++){
                if(i==5 && j==5){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
