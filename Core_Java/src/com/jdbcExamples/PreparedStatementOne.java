package com.jdbcExamples;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementOne {
	static Connection con;
	static PreparedStatement ps;
     
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void create() {
		try {
			con=getConnection();
			ps=con.prepareStatement("create table baby(id int primary key not null,name varchar(24),image BloB)");
			ps.execute();
			System.out.println("created table");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
		try {
			con=getConnection();
			ps=con.prepareStatement("insert into baby values(?,?,?)");
			ps.setInt(1,102);
			ps.setString(2,"stella");
		    File f=new File("C:\\Users\\91958\\Desktop\\cat.JPG");
		    FileInputStream fis=new FileInputStream(f);
		    long length=f.length();
		    ps.setBlob(3,fis,length);
		    ps.execute();
		    con.close();
		    System.out.println("image has been updated");
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		//create();
		insert();
	}
}
