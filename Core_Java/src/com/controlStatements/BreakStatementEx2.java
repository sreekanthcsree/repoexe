package com.controlStatements;

public class BreakStatementEx2 {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==6) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("---------------------------------");
	int j=1;
	do {
		if(j==3) {
			break;
		}
		System.out.println(j);
		j++;
	}while(j<=10);
		
	}

}
