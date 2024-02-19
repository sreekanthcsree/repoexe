package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableExample {
	public static void getRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String q="select * from emp";
			ResultSet rs=st.executeQuery(q);
			System.out.println(rs.absolute(23));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
  public static void main(String[] args) {
	  getRecords();
}
}
