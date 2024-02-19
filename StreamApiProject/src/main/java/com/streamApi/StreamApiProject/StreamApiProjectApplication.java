package com.streamApi.StreamApiProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class StreamApiProjectApplication {

	static List<Employee> list = new ArrayList<Employee>();

	static {
		list.add(
				new Employee("Harshitha", "Prasanna", "Female", 50000.56f, "Bangalore", List.of("UST", "Incture"))
		);
		list.add(
				new Employee("Prakash", "Dextris", "Male", 60000.86f, "Andhra Pradesh", List.of("UST", "LTTS"))
		);
		list.add(
				new Employee("Durga", "Vijaya", "Female", 70000.90f, "Andhra Pradesh", List.of("Wipro", "Infosys"))
		);

		System.out.println(list);
		System.out.println("------------------------------------------------------------------------------------------");

	}



	public static void main(String[] args) {
		//SpringApplication.run(StreamApiProjectApplication.class, args);

		//foreach
		list.stream()
				.forEach(sree->System.out.println(sree));


		//intermediate operations(Map)
		//collect
	List<Employee>incSalary=
			list.stream()
				.map(sree->new Employee(
						sree.getfName(),sree.getlName(),sree.getGender(),sree.getSalary() * 1.20f,
						sree.getLocation(),sree.getListEmployees()
				))
				.collect(Collectors.toList());
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(incSalary);

		//filter
		List<Employee>listFilter=
				list.stream()
				.filter(sree->sree.getSalary()>70000.56f)
				.map(sree->new Employee(
						sree.getfName(),sree.getlName(),sree.getGender(),sree.getSalary() * 1.20f,
						sree.getLocation(),sree.getListEmployees()
				))
				.collect(Collectors.toList());
		System.out.println(listFilter);
		System.out.println("------------------------------------------------------------------------------------");

		//findFirst
		Employee findEmployee=
				list.stream()
						.filter(sree->sree.getSalary()>70000.56f)
						.map(sree->new Employee(
								sree.getfName(),sree.getlName(),sree.getGender(),sree.getSalary() * 1.20f,
								sree.getLocation(),sree.getListEmployees()
						))
								.findFirst()
										.orElse(null);
		System.out.println(findEmployee);
		System.out.println("------------------------------------------------------------------------------------");

		//flatMap
		String str=
				list.stream()
				.map(sree->sree.getListEmployees())
				.flatMap(strings->strings.stream())
				.collect(Collectors.joining(","));
		System.out.println(str);
		System.out.println("------------------------------------------------------------------------------------");

		//ShirtCircuit operations
     	List<Employee>sc=
			   list.stream()
				.skip(1)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println(sc);
		System.out.println("------------------------------------------------------------------------------------");

		//Finite Data
		Stream.generate(Math::random)
				.limit(5)
				.forEach(value-> System.out.println(value));
		System.out.println("------------------------------------------------------------------------------------");

		//sorting
		List<Employee>sorting=
				list.stream()
				.sorted((o1, o2) -> o1.getfName().compareToIgnoreCase(o2.getfName()))
				.collect(Collectors.toList());
		System.out.println(sorting);
		System.out.println("------------------------------------------------------------------------------------");

		//min or max
		list.stream()
				.max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("------------------------------------------------------------------------------------");

		//reduce
	Float reduce=
			list.stream()
				.map(salary-> salary.getSalary())
				.reduce(0.0f,Float::sum);
		System.out.println(reduce);



	}
}
