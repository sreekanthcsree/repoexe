package com.basics;

import java.util.*;

public class SuperClassEx extends ClassEx{
	
	public void add(int a,int b) {
		super.add(20,40);
    	int c=a+b;
    	System.out.println("childclass class : "+c);
    }
	public static void main(String[] args) {
		SuperClassEx ex = new SuperClassEx();
	    ex.add(10, 20);
	   
	}
	
	Map<Integer,Integer> map = new HashMap<>();
	

}
