package com.javaConversions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate {
	public static void main(String[] args) throws Exception {
		String s="17/06/1998";  
	    Date d=new SimpleDateFormat("dd/MM/yyyy").parse(s);  
	    System.out.println(s+"  "+d); 
	    System.out.println("----------------------------------------------------------------->");
	    
	    
	   //to convert Date to String
	    Date date=Calendar.getInstance().getTime();
	    DateFormat df=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	    String s1=df.format(date);
	    System.out.println("Converting date to String: "+s1);
	}
}
