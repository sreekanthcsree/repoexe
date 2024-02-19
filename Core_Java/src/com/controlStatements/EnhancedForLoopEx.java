package com.controlStatements;

public class EnhancedForLoopEx {

    public static void main(String[] args) {
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Array Names:\n");//'\n' means space for one line
        for(String s:names) {
            System.out.println(s);
        }
    }
}
