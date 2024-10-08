package com.dextris.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
@Entity
@Table(name="projects", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"projectCode"})
})
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private long projectCode;
	@Column(nullable = false)
	private String projectName;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	

}
