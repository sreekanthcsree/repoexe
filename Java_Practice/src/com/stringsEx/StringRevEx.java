package com.stringsEx;

public class StringRevEx {
	
	public static void main(String[] args) {
		String s="Happy new year";
		String a[]=s.split("\\s");
		//System.out.println(s);
		StringBuilder sb=new StringBuilder();
		for(int i=a.length-1;i>=0;i--) {
			sb.append(a[i]+" ");
	}
		System.out.println(sb);
   }
}
