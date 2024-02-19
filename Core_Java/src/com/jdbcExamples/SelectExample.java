package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			Statement st=con.createStatement();
			String query="select * from emp";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getLong(4));
				System.out.println(rs.getString(5));
				System.out.println("----------->");
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();  
		}
	}
}
