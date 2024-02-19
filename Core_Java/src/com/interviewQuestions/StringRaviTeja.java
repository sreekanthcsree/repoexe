package com.interviewQuestions;

public class StringRaviTeja {

    public static void main(String[] args) {
        String str="daddy";
        boolean b=true;

        for(char i:str.toCharArray()) {
            if(str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("first non-repeating character is:"+i);
                b=false;
                continue;
            }
        }
        if(b) {
            System.out.println("there is no non-repeating character is:");
        }
    }
}
