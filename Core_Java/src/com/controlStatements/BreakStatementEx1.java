package com.controlStatements;

public class BreakStatementEx1 {
	
	public static void main(String[] args) {
		int i,j;
		//outer for loop
		for(i=1;i<=3;i++) {
			//inner for loop
			for(j=1;j<=3;j++) {
				if(i==2&j==2) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
