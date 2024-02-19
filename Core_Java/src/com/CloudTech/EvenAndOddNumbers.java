package com.CloudTech;

public class EvenAndOddNumbers {
	  public static void arrayEvenOdd(int arr[]){
	        int[] a=new int[arr.length];
	        int index=0;
	        int o = 0;
			for (int i=o;i<arr.length;i++){
	            if(arr[i]%2 == 0){
	                a[index]=arr[i];
	                index++;
	            }
	        } 
	        for (int i=0;i<arr.length;i++){
	            if(arr[i]%2 !=0){
	                a[index]=arr[i];
	                index++;
	            }
	        }
	        for(int i=o;i<a.length;i++){
	            System.out.print(a[i]+",");
	        }
	    }
	    public static void main(String[] args) {
	      int[] arr1={1,2,5,4,7,8,11,24};
	      arrayEvenOdd(arr1);
	    }
	}
