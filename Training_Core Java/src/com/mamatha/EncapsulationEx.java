package com.mamatha;

public class EncapsulationEx {
	
	//POJO:Plane Old Java Object
	//Hibernate : Hiber
	
	
	public static void main(String[] args) {
		 String str = "Hi hello welcome to Bangalore";
		   char[] ch = str.toCharArray();
		   for(int i=ch.length-1;i>=0;i--) {
			   System.out.print(ch[i]);
		   }
		   System.out.println("=================");
		   StringBuffer sb = new StringBuffer(str);
		   System.out.println(sb.reverse());
		 }


}
