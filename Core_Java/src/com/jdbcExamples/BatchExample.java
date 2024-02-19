package com.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExample {
	Connection con=null;
	Statement st=null;
	
	public Statement getStatement() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Root");
			st=con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	public void insert() {
		st=getStatement();
		String q1="insert into emp values(1111,'chandra','sekhar',123456689,'male')";
		String q2="insert into emp values(1112,'kushwanth','ramlal',787546689,'male')";
		String q3="insert into emp values(1113,'durga','vijaya',5462828909,'female')";
		String q4="insert into emp values(1114,'nagaram','kishore',983406689,'male')";
		try {
			con.setAutoCommit(false);
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.addBatch(q4);
			st.executeBatch();
			con.commit();
			System.out.println("data has been inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		BatchExample ex=new BatchExample();
		ex.insert();
	}
}
