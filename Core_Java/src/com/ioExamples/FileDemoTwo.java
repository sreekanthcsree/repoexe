package com.ioExamples;

import java.io.FileWriter;

public class FileDemoTwo {
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("C:\\users\\dell\\desktop\\Java IO\\Ohm Sakthi.txt");
		fw.write("Hai Hello,Welcome to Java Classes");
		/*
		 * fw.write("public class Sree{" + "public static void main(String[] args){" +
		 * "System.out.println(hello)}");
		 */		fw.close();
		System.out.println("Data Successfully Updated");
	}
}
