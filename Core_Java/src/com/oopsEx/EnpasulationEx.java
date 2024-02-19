package com.oopsEx;

public class EnpasulationEx {

    private int id;
    private String name;
    private String role;
    private double salary;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args){
        EnpasulationEx e=new EnpasulationEx();
        EnpasulationEx e1=new EnpasulationEx();

        e.setId(153);
        e.setName("Sreekanth");
        e.setRole("IT-Recruiter");
        e.setSalary(15000.56);

        System.out.println("Id : "+e.getId()+", Name : "+e.getName()+", Role : "+e.getRole()+", Salary : "+e.getSalary());
        System.out.println("-------------------------------------------------------------------------------->");

        e.setId(154);
        e.setName("Prakash");
        e.setRole("IT-Recruiter");
        e.setSalary(20000.00);

        System.out.println("Id : "+e.getId()+", Name : "+e.getName()+", Role : "+e.getRole()+", Salary : "+e.getSalary());

    }
}
