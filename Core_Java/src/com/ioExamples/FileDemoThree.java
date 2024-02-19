package com.ioExamples;

import java.io.File;
import java.util.Scanner;

public class FileDemoThree {
	public static void main(String[] args) throws Exception {
		File f=new File("C:\\users\\dell\\desktop\\Java IO\\Ohm Sakthi.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			String st=sc.nextLine();
			System.out.println(st);
		}
		sc.close();
	}
}
