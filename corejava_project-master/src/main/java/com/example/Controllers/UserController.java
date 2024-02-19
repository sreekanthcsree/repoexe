package com.example.Controllers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.perform.operation.Operations;
@Controller
public class UserController {

	@Autowired
	private Operations operations;
	Scanner sc = new Scanner(System.in);
	
    //    ADMIN --> 
	
	public void adminOperations() {
        System.out.println(" Welcome to Admin Dashboard ! ");
		int a;
		int operation;
		if(this.operations.checkCredentialsAdmin() == true) {
		do {
			System.out.println(" To cteate user enter 1 ");
			System.out.println(" To get all users enter 2 ");
			System.out.println(" To update user enter 3 ");
			System.out.println(" To delete user enter 4 ");

			operation = sc.nextInt();
			switch (operation) {
			case 1: this.operations.createUser();
				break;
			case 2: this.operations.getAllUsers();
				break;
			case 3: this.operations.updateUser();
				break;
			case 4: this.operations.deleteUser();
				break;
			}
			System.out.println(" If you want to repeat any operations enter 1 !"); 
			System.out.println(" To come out from ADMIN profile enter any key ");
			a = sc.nextInt();
		} while (a == 1);
		}
		else {
			System.out.println(" Wrong username/passward ! ");
			System.out.println(" OR try login through EMPLOYEE/HR profile ! ");
		}
	}
	
	//               EMPLOYEE --> 
	
	public void EmployeeOperations() {
        System.out.println(" Welcome to Employee Dashboard ! ");
		int a;
		int operation;
		if(this.operations.checkCredentialsEmployee()== true) {
		do {
			System.out.println(" To get all users enter 2 ");
			
			operation = sc.nextInt();
			switch (operation) {
			case 2: this.operations.getAllUsers();
				break;
			}
			System.out.println(" If you want to repeat any operations enter 1 !");
			System.out.println(" To come out from EMPLOYEE profile enter any key ");
			a = sc.nextInt();
		} while (a == 1);
		}
		else {
			System.out.println(" Wrong username/passward ! ");
			System.out.println(" OR try login through ADMIN/HR profile ! ");
		}
	}
	
	                //    HR --> 
	
	public void HROperations() {
        System.out.println(" Welcome to Admin Dashboard ! ");
		int a;
		int operation;
		if(this.operations.checkCredentialsHr() == true) {
		do {
			System.out.println(" To get all users enter 2 ");
			System.out.println(" To update user enter 3 ");
			System.out.println(" To delete user enter 4 ");

			operation = sc.nextInt();
			switch (operation) {
			case 2: this.operations.getAllUsers();
				break;
			case 3: this.operations.updateUser();
				break;
			case 4: this.operations.deleteUser();
				break;
			}
			System.out.println(" If you want to repeat any operations enter 1 !");
			System.out.println(" To come out from HR profile enter any key ");
			a = sc.nextInt();
		} while (a == 1);
		}
		else {
			System.out.println(" Wrong username/passward ! ");
			System.out.println(" OR try login through ADMIN/EMPLOYEE profile ! ");
		}
	}
}
