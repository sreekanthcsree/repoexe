package com.ioExamples;

import java.util.Scanner;

public class ScannerExample {
	 public static void main(String args[]){                       
         String s = "This is Employee details...!";
         //Create scanner Object and pass string in it  
         Scanner scan = new Scanner(s);  
         //Check if the scanner has a token  
         System.out.println("Boolean Result: " + scan.hasNext());  
         //Print the string  
         System.out.println("String: " +scan.nextLine());  
         scan.close();           
         System.out.println("--------Enter Your Details-------- ");  
         Scanner in = new Scanner(System.in);  
         System.out.print("Enter your name: ");    
         String name = in.next();   
         System.out.println("Name: " + name);           
         System.out.print("Enter your age: ");  
         int i = in.nextInt();  
         System.out.println("Age: " + i);  
         System.out.print("Enter your salary: ");  
         double d = in.nextDouble();  
         System.out.println("Salary: " + d);
         System.out.println();
         System.out.println("Name : "+name+", Age : "+i+", Salary : "+d);
         in.close();           
         }    
}
