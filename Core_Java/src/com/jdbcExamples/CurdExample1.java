package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CurdExample1 {
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
			rs=st.executeQuery("select*from login");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				//System.out.println(rs.getLong(4));
				System.out.println(rs.getString(5));
				System.out.println("----------->");
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public static void insert() {
		st=getStatement();
		String query = "insert into login values(1006,'rk','ramlal',012366,'male')";
		try {
			boolean b=st.execute(query);
			if(b) {
				System.out.println("data has been inserted");
			}else {
				System.out.println("there is an error");
		
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		st=getStatement();
		String query="delete from login where id=1006";
		try {
			int i=st.executeUpdate(query);
			System.out.println("number of rows effected:"+i);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		st=getStatement();
		String query="update emp set f_name='lokesh' where id=1510214";
		try {
			int i=st.executeUpdate(query);
			System.out.println("number rows effected:"+i);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
	
		}
	}
	
public static void main(String[] args) {
	select();
	//insert();
	//update();
	//delete();
  
	
}

}
