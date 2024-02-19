package com.controlStatements;

public class ContinueStatementEx {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==6) {
				continue;//output is 1234578910
			}
			System.out.println(i);
		}
	}

}
