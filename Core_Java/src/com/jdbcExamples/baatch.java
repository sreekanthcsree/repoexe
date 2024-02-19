package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class baatch{
	Connection con = null;
	Statement st = null;
	public  Statement getStatement() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root");
	Statement st = con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	public void insert(){
		st = getStatement();
		
	
	String Query1 = "insert into hai values (101,'shyam','kumar',125458785,'male')";
	String Query2 = "insert into hai values (200,'kumar','shyam',124587487,'male')";
	String Query3 = "insert into hai values (300,'sam','kjiuuv',1236547954,'male')";
	try {
	con.setAutoCommit(false);
	st.addBatch(Query3);
	st.addBatch(Query2);
	st.addBatch(Query1);
	st.executeBatch();
	con.commit();
	 System.out.println("data inserted");
	}catch(Exception e) {
		e.printStackTrace();
	}		
}
public static void main(String[] args){
	baatch n = new baatch();
	n.insert();
}
}
