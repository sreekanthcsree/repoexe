package com.dextris;

public class StaticInitializationBlock {
	
	public static void main(String[] args) {}

    static{
        System.out.println("Static block...!");
        System.exit(0);
    }
}