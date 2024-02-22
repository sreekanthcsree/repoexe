package com.InterviewQuestions;

import java.util.Stack;

public class FindBalancedString {


    public static boolean chaeckBalanceSring(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;

                } else {
                    char firstSymbol = stack.pop();
                    if ((ch == ')' && firstSymbol != '(') || (ch == ']' && firstSymbol != '[') ||
                            (ch == '}' && firstSymbol != '{')) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        boolean status =chaeckBalanceSring("[()]{}{[()()]()}");
        if(status){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }

    }
}
