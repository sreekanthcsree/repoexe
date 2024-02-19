package com.controlStatements;

public class ForLoopEx1 {

    public static void main(String[] args) {
        String[] names = {" *Java"," *C"," *C++"," *Python"," *JavaScript"};
        System.out.println("Display array names:");
        for(String s1:names) {
            System.out.println(s1);
        }
        System.out.println("--------------------------------------------->");
        int[] i= {2,4,5,6,7,9};
        System.out.println("Dispaly the integer values: ");
        for(int sree:i) {
            System.out.print(sree+" ");
        }
        System.out.println("-------------------------------------------------->");
        char[] ch= {'s','r','e','e','k','a','n','t','h'};
        System.out.println("Dispaly the Char values : ");
        for(char c : ch) {
            System.out.print(c);
        }
    }
}
