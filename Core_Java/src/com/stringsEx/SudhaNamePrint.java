package com.stringsEx;

public class SudhaNamePrint {


    public static String trans(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char transformedChar = transformCharacter(currentChar);
            output.append(transformedChar);
        }
        return output.toString();
    }
    public static char transformCharacter(char c) {
        // Define the transformation rules here
        switch (c) {
            case 'a':
                return 's';
            case 'b':
                return 't';
            case 'c':
                return 'e';
            case 'd':
                return 'l';
            case 'e':
                return 'l';
            case 'f':
                return 'a';
            case 'g':
                return ' ';
            case 'h':
                return ' ';
            case 'i':
                return ' ';
            case 'j':
                return ' ';
            case 'k':
                return ' ';
            case 'l':
                return ' ';
            case 'm':
                return ' ';
            case 'n':
                return ' ';
            case 'o':
                return ' ';
            case 'p':
                return ' ';
            case 'q':
                return ' ';
            case 'r':
                return ' ';
            case 's':
                return ' ';
            case 't':
                return ' ';
            case 'u':
                return ' ';
            case 'v':
                return ' ';
            case 'w':
                return ' ';
            case 'x':
                return ' ';
            case 'y':
                return ' ';
            case 'z':
                return ' ';
            default:
                return c;
        }
    }

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String output = trans(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

}

