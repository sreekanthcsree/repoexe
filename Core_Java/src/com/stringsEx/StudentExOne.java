package com.stringsEx;

public class StudentExOne {

    int rollNo;
    String name;
    String role;

    public StudentExOne(int rollNo, String name, String role) {
        this.rollNo = rollNo;
        this.name = name;
        this.role = role;
    }
    public String toString(){
        return "Student Roll No : "+rollNo+", Student Name : "+name+", Student Role : "+role;
    }

    public static void main(String[] args) {
        StudentExOne so=new StudentExOne(101,"Prakash","IT-Recruiter");
        StudentExOne so1=new StudentExOne(102,"Vijaysimha","IT-Recruiter");

       // so.toString();so1.toString();
        System.out.println(so.toString());
        System.out.println(so1.toString());
    }
}
