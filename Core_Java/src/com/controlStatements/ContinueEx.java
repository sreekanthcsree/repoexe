package com.controlStatements;

public class ContinueEx {

    public static void main(String[] args) {
        for(int i=0;i<=18;i++){
            if(i==2 | i== 6 | i==16){
                continue;
            }
            System.out.println(i);
        }
    }
}
