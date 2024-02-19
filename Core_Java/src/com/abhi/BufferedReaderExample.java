package com.abhi;

import java.io.*;

public class BufferedReaderExample {
	public BufferedReaderExample(InputStreamReader r) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReaderExample br=new BufferedReaderExample(r);
		System.out.println("Enter Your Name:");
		String name=br.readLine();
		System.out.println(name);
	}

	private String readLine() {
		// TODO Auto-generated method stub
		return "sree";
	}

	
}
