package com.ioExamples;

import java.io.FileOutputStream;

//it can be stored single character program
public class FileDemoFour {
	public static void main(String[] args) {
		/*
		 * try { FileOutputStream fos=new FileOutputStream("D:\\Sreekanth.txt");
		 * fos.write(65); fos.close(); System.out.println("Successfully updated");
		 * }catch(Exception e) { e.printStackTrace(); }
		 */
		 
		try {
			FileOutputStream fos=new FileOutputStream("C:\\users\\dell\\desktop\\Java IO\\Ohm Sakthi.txt");
			String s="Hai Iam Sreekanth";//it can stored group of characters
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Hai Hello Welcome to tirupathi");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
