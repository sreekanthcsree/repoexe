package com.dextris.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {
	
	private long id;
	private String employeeName;
	private String employeeEmail;
	private String employeeBaseLocation;
	private long projectCode;
	private String projectName;

}
