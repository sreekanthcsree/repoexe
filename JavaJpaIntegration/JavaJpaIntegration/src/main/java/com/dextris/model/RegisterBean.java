package com.dextris.model;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class RegisterBean {

    private Long personId;
    private String personName;
    private String password;
    private String designation;
    private String email;
    private String mobileNo;
    private String dob;
}
