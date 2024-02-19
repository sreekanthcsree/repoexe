package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementEx {
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
		String query="create table image(id int primary key not null,username varchar(23),password varchar(25),gender varchar(10))";
		try {
			con=getConnection();
			ps=con.prepareStatement(query);
			ps.execute();
			System.out.println("table created");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
		try {
			con=getConnection();
			ps=con.prepareStatement("insert into image values (?,?,?,?,?) ");
			ps.setInt(1,104);
			ps.setString(2,"durga");
			ps.setString(3,"theja@123");
			ps.setString(4,"male");
			ps.setString(5,"chittoor");
			ps.execute();
			System.out.println("record inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		try {
			con=getConnection();
			ps=con.prepareStatement("update image set username=?,password=?,gender=? where id=?");
			ps.setString(1,"anil");
			ps.setString(2,"ani@123");
			ps.setString(3,"male");
			ps.setInt(4,103);
			ps.execute();
			System.out.println("record updated");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		try {
			con=getConnection();
			ps=con.prepareStatement("delete from image where id=103");
			ps.execute();
			System.out.println("deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void addColumn() {
		try {
			con=getConnection();
			ps=con.prepareStatement("alter table image add location varchar(10)");
			ps.execute();
			System.out.println("addColumn");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update1() {
		try {
			con=getConnection();
			ps=con.prepareStatement("update image set password='aji@173' where id=101");
			ps.execute();
			System.out.println("updated1");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//create();
		//insert();
		//update();
		//delete();
		//addColumn();
		update1();
	
	}

}
