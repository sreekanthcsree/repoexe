package com.example;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.Controllers.UserController;

@SpringBootApplication
public class CoreJavaProjectApplication {	
	public static void main(String[] args) {
		SpringApplication.run(CoreJavaProjectApplication.class, args);
	} 
		Scanner sc = new Scanner(System.in);
		
	 @Bean
	    public CommandLineRunner commandLineRunner(UserController userController) {
	        return args -> {
	        System.out.println("Welcome to core java project");
			int a;
			do {
				System.out.println("Please Chose Your role ! ");
				System.out.println(" 1. Admin");
				System.out.println(" 2. Employee");
				System.out.println(" 3. HR");
	
				int roles = sc.nextInt();
				switch (roles) {
				case 1:
					System.out.println(" Admin Profile ! ");
					userController.adminOperations();
					break;
				case 2:
					System.out.println(" Employee profile ! ");
					userController.EmployeeOperations();
					break;
				case 3:
					System.out.println(" HR Profile ! ");
					userController.HROperations();
					break;
				}
	
				System.out.println(" If you want to enter into Admin/HR/Employee profile please enter 1 ");
				a = sc.nextInt();
			} while (a == 1);
	        };
	        }
}
