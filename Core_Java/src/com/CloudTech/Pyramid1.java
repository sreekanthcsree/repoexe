package com.CloudTech;

public class Pyramid1 {
	public static void main(String[] args) {
		int n=10,num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}

}
