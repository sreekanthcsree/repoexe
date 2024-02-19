package com.stringsEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Hi Hello Welcome to Java");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
        }
    }
}
