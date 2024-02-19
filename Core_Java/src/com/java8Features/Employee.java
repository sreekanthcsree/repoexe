package com.java8Features;

public class Employee {

    private int id;
    private String name;
    private int age;
    private Long salary;

    public Employee(int id,String name,int age,Long salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    /*public void setId(int id){
        this.id=id;
    }*/
    public int getId(){
        return id;
    }
    /*public void setName(String name){
        this.name=name;
    }*/
    public String getName(){
        return name;
    }
   /* public void setAge(int age){
        this.age=age;
    }*/
    public int getAge(){
        return age;
    }
    /*public void setSalary(Long salary){
        this.salary=salary;
    }*/
    public Long getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
