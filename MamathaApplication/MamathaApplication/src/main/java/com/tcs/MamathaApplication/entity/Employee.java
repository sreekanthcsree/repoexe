package com.tcs.MamathaApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
//@ToString
@Builder
public class Employee {

    @Id
    int eid;
    String ename;
    String email;
    String mobileNo;
    String gender;
    String salary;
}
