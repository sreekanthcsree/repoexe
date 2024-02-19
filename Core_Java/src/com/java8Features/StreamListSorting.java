package com.java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");

        System.out.println("This is normal way : "+fruits);

        System.out.println("========Ascending Order=========");

        List<String> sorting = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorting the values : "+sorting);

        //using lambda expression
        List<String> sorting1 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("Using Lambda Expression : "+sorting1);

        List<String> sorting2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorting the values : "+sorting2);

        System.out.println("========descending Order=========");

        List<String> sorting3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorting the values : "+sorting);

        //using lambda expression
        List<String> sorting4 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println("Using Lambda Expression : "+sorting1);


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Sreekanth",24,13200l));
        employees.add(new Employee(2,"Ajith",23,15200l));
        employees.add(new Employee(3,"Puspharaj",27,23200l));
        employees.add(new Employee(4,"Nani",19,10200l));
        employees.add(new Employee(5,"Ramlal",22,11200l));

        List<Employee> employeesSorted = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        System.out.println(employeesSorted);

        //using lambda expression
        System.out.println("======getSalary Ascending & Descending order=====");
        List<Employee> employeesSorted1 = employees.stream()
                .sorted((o1,o2)-> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println("Using lambda expression : "+employeesSorted1);

        List<Employee> employeesSorted2 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("Ascending order : "+employeesSorted2);

        List<Employee> employeesSorted3 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("descending order : "+employeesSorted3);

        System.out.println("======getName Ascending & Descending order=====");
        List<Employee> employeesSorted4 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("Ascending order : "+employeesSorted4);

        List<Employee> employeesSorted5 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println("descending order : "+employeesSorted5);

        System.out.println("======getAge Ascending & Descending order=====");
        List<Employee> employeesSorted6 = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Ascending order : "+employeesSorted6);

        List<Employee> employeesSorted7 = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println("descending order : "+employeesSorted7);

    }
}
