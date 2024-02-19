package com.ioExamples;

import java.io.File;

public class FileDemoOne {
	public static void main(String[] args) {
		File f=new File("C:\\users\\dell\\desktop\\Java IO\\Ohm Sakthi.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.length());
		}else {
			System.out.println("file is not there");
		}
	}
}
