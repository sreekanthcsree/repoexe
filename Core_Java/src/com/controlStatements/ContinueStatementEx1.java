package com.controlStatements;

public class ContinueStatementEx1 {
	
	public static void main(String[] args) {
		int i=1;
		while(i<=8) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------------->");
		int j=1;
		do {
			if(j==7) {
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}while(j<=10);
		}
	}
