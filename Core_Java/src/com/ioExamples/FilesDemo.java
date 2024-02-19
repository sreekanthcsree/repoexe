package com.ioExamples;

import java.io.File;

public class FilesDemo {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\DELL\\Desktop\\Java IO\\Ohm Sakthi.txt");
		try {
		if(f.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File already exists");
		}
	}catch(Exception e) {
		System.out.println("An error occured");
		e.printStackTrace();
	}
	}
}
//C:\Users\DELL\Desktop