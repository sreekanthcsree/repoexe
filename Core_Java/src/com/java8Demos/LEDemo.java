package com.java8Demos;

@FunctionalInterface
interface HelloWorld{
	
	public String say(String msg);
}

public class LEDemo {
	
	public static void main(String[] args) {
		
		HelloWorld hello = (msg)->{String s1 = "I would like to say";
			                       String s2 = s1+msg;
			                       return s2;
		                       };
		System.out.println(hello.say(", Time is precious"));
		
	}

}
