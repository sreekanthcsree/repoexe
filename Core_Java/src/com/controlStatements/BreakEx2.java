package com.controlStatements;

public class BreakEx2 {

    public static void main(String[] args) {
        int i=1;
        do{
            if(i==4){
                i++;
                break;
            }
            System.out.println(i);
            i++;

        }while(i<=8);
    }
}
