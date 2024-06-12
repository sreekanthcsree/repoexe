package com.abhi;

public class DemoOne {
	
	
	
	public static void sotingEx(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int  temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,4,5,7,8,9,1,4,5};
		sotingEx(arr);
		
		System.out.println("Sorted array");
		
		for(int num : arr) {
			System.out.println(num+" ");
		}
	}

}
