package com.ioExamples;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceISEx {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("D:\\Sreekanth.txt");
		FileInputStream fis1=new FileInputStream("D:\\Sreekanth1.txt");
		//FileInputStream fis2=new FileInputStream("D:\\Sree.txt");
		SequenceInputStream sis=new SequenceInputStream(fis,fis1);
		int j;
		while((j=sis.read())!=-1) {
			System.out.print((char)j);
		}
		sis.close();
		fis1.close();
		fis.close();
	}
}
