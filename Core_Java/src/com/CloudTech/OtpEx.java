package com.CloudTech;

public class OtpEx {
	
	public static void main(String[] args) {
		
		int randomOtp = (int) (Math.random()*9000+1000);
		
		String output = String.valueOf(randomOtp);
		System.out.println(randomOtp);
	}

}
