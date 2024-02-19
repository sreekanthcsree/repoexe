package com.CloudTech;

public class ProgramStringOne {
	//to find rotation
	public static void main(String[] args) {
		String s1="EFGH";
		String s2="HGEZ";
		
		if(rotational(s1,s2)) {
			System.out.println("Rotation of String is present");
		}else {
			System.out.println("Rotation not found");
		}
	}
	public static boolean rotational(String s1,String s2) {
		return (s1.length()==s2.length()) && ((s1+s2).indexOf(s2)!=-1);
	}
}
