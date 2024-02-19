package com.controlStatements;

import java.util.Scanner;

public class StudentRank {

    public static void main(String[] args) {
        System.out.println("---------Student Ranks---------");

        Scanner sc= new Scanner(System.in);
        System.out.println("Student S1 : ");
        int s1 = sc.nextInt();

        System.out.println("Student S2 : ");
        int s2 = sc.nextInt();

        System.out.println("Student S3 : ");
        int s3 = sc.nextInt();

        int total = s1+s2+s3;
        System.out.println("Student Total Marks : "+total);

        int a=100;
        if(a >=300){
            System.out.println("Rank 'A'");
        }else if(a>300 || a<=270){
            System.out.println("Rank 'B'");
        }else if(a>270 || a<=250){
            System.out.println("Rank 'C'");
        }else if(a>250 || a<=230){
            System.out.println("Rank 'D'");
        }else if(a>230 || a<=150){
            System.out.println("Average Marks");
        }else{
            System.out.println("Fail");
        }

    }
}
