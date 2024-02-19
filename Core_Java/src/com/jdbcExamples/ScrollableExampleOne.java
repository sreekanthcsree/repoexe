package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableExampleOne {
	public static void getRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String q="select * from emp";
			ResultSet rs=st.executeQuery(q);
			System.out.println(rs.absolute(1));
			System.out.println("f_name:"+rs.getString(2));
			System.out.println("l_name:"+rs.getString(3));
			System.out.println("mobile:"+rs.getLong(4));
			System.out.println("gender:"+rs.getString(5));
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
   public static void main(String[] args) {
	   getRecords();
}
}
