package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaDataExample {
	public static void getDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			Statement st=con.createStatement();
			String q="select * from emp";
			ResultSet rs=st.executeQuery(q);
			
			ResultSetMetaData md=rs.getMetaData();
			System.out.println(md.getTableName(2));
			System.out.println("number of columns:"+md.getColumnCount());
			for(int i=1;i<=md.getColumnCount();i++) {
				System.out.println(md.getColumnName(i)+" "+md.getColumnTypeName(i));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
    	MetaDataExample ex=new MetaDataExample();
    	ex.getDetails();
	}
}
