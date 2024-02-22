package com.dextris;

import com.dextris.controller.PersonController;
import com.dextris.entity.Employee;
import com.dextris.model.RegisterBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class JavaJpaIntegrationApplication {

	@Autowired
	private PersonController personController;

	public static void main(String[] args) {
		SpringApplication.run(JavaJpaIntegrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {


			System.out.println("************Choose Your Choice**************");
			System.out.println("1: Employee Registration");
			System.out.println("2: Employee Login");

			Scanner scanner = new Scanner(System.in);
			int val = scanner.nextInt();
			switch (val) {
				case 1:
					System.out.println("-------Employee Registration Form-------");
					RegisterBean registerBean = new RegisterBean();
					System.out.println("Enter Employee Id : ");
					Long personId = scanner.nextLong();
					registerBean.setPersonId(personId);
					scanner.nextLine();
					System.out.println("Enter Employee personName : ");
					String personName = scanner.next();
					scanner.nextLine();
					registerBean.setPersonName(personName);
					System.out.println("Enter Employee Password : ");
					String password = scanner.next();
					registerBean.setPassword(password);
					scanner.nextLine();
					System.out.println("Enter Employee Designation : ");
					String role = scanner.next();
					registerBean.setDesignation(role);
					scanner.nextLine();
					System.out.println("Enter Employee Email : ");
					String email = scanner.next();
					registerBean.setEmail(email);
					scanner.nextLine();
					System.out.println("Enter Employee mobile : ");
					String mobile = scanner.next();
					registerBean.setMobileNo(mobile);
					scanner.nextLine();
					System.out.println("Enter Employee DOB : ");
					String dob = scanner.next();
					registerBean.setDob(dob);
					personController.register(registerBean);
					break;
				case 2:
					personController.login();
					break;
				default:
					System.out.println("............No Student Activites.....");

			}

		};
	}
}