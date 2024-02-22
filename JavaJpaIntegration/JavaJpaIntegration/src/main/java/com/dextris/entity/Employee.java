package com.dextris.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_employee")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String emp_name;
    private String password;
    private String designation;
    private String email;
    private String mobileNo;
    private String dob;
}
