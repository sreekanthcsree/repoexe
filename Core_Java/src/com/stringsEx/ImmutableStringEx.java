package com.stringsEx;

public class ImmutableStringEx {
	public static void main(String[] args) {
		
		String s="Rohit";
		s.concat(" Kohli");
		System.out.println(s);//will print Rohit because strings are immutable objects 
		
		
		
		String s1="Sachin ";
		System.out.println(s1.length());
		s1=s1.concat(" Tendulkar");
		System.out.println(s1);
		System.out.println("Length : "+s1.length());
		
		
		String s2=new String("Sreekanth");
		s2=s2.concat(" Chillamakulapalli");
		System.out.println(s2);
		
		String s9="Hi Hello Welcome to Bangalore";
		System.out.println(s9.substring(9,12));
	}	
}
