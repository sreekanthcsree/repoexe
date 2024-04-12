package com.dexDrive;

import java.util.stream.Collectors;

public class ReverseNumberDemo {
	
	public static int reverseNum(int num) {
		int reversedNum=0;
		while(num!=0) {
			int digit=num%10;
			reversedNum=reversedNum*10+digit;
			num/=10;
		}
		return reversedNum;
	}
	
	public static void main(String[] args) {
		
		int num=12345;
		int reversedNum=reverseNum(num);
		System.out.println("Input Num : "+num);
		System.out.println("Output Num : "+reversedNum);
		System.out.println("=================using streams========================");
             
		int number = 12345;
        int reversedNumber = reverseNumberOne(number);

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
	}
    public static int reverseNumberOne(int number) {
        String reversedString = String.valueOf(number)
                .chars()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining());

        // Convert the reversed string back to an integer
        return Integer.parseInt(reversedString);
	}

}
