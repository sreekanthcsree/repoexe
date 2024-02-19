package com.ioExamples;

import java.io.FileInputStream;

public class FileDemoFive {
	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("C:\\users\\dell\\desktop\\Java IO\\Ohm Sakthi.txt");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);//it can read from entire sentence
		}
		fis.close();
	}catch(Exception e) {
		e.printStackTrace();	
   }
 }
}
