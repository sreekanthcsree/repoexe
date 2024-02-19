package com.streamApi.StreamApiProject;

import java.util.List;

public class Employee {

    private String fName;
    private String lName;
    private String gender;
    private float salary;
    private String location;
    private List<String>listEmployees;

    public List<String> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(List<String> listEmployees) {
        this.listEmployees = listEmployees;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", listEmployees=" + listEmployees +
                '}';
    }

    public Employee() {
    }

    public Employee(String fName, String lName, String gender, float salary, String location, List<String> listEmployees) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.salary = salary;
        this.location = location;
        this.listEmployees = listEmployees;
    }
}
