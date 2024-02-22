package com.abhi;

public class Hello {
	
	// Scanner scanner1= new Scanner(System.in);
	System.out.println("Enter id : ");
	Long id = scanner.nextLong();
	System.out.println("Enter password : ");
	String pass = scanner.next();
	//Long Long = null;
	Employee emp = (Employee) emp.get(Employee.class,id);

	if (emp != null && emp.getPassword().equals(pass)) {
		System.out.println("Login Successfully...");

	} else {
		System.out.println("Invalid username or password...");
	}

}
