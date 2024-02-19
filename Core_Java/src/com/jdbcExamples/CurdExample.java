package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CurdExample {
	 static Connection con;
	 static Statement st;
	 static ResultSet rs;
	 
	 public static Statement getStatement() {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			 st=con.createStatement();
	
		 }catch(Exception e) {
			 e.printStackTrace(); 
		 }
		 return st;
	 }
	 public static void select() {
		 try {
			 st=getStatement();
			 rs=st.executeQuery("select * from image");
			 while(rs.next()) {
				 System.out.println(rs.getInt(1));
				 System.out.println(rs.getString(2));
				 System.out.println(rs.getString(3));
				 System.out.println(rs.getString(4));
				 //System.out.println(rs.getString(5));
				 System.out.println("------->");
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	public static void main(String[] args) {
		select();
		
	}

}
