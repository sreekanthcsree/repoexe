package com.stringsEx;

public class StudentEx {

    int rollNo;
    String name;
    String role;

    public StudentEx(int rNo,String n,String r){
        this.rollNo=rNo;
        this.name=n;
        this.role=r;
    }
    public void display(){
        System.out.println("Student Roll No : "+rollNo+" Student Name : "+name+" Student Role : "+role);
    }
    public static void main(String[] args) {
        StudentEx ex=new StudentEx(153,"Vijaya Durga","Software Engineer");
        StudentEx ex1=new StudentEx(154,"Sreekanth","Java Developer");

        ex.display();ex1.display();

    }
}
