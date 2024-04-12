package com.dex.service;

import com.dex.entity.EmployeeInfo;
import com.dex.repo.EmployeeInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeInfoService implements UserDetailsService {

    @Autowired
    private EmployeeInfoRepo employeeInfoRepo;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<EmployeeInfo> userDetail = employeeInfoRepo.findByName(username);
        // Converting userDetail to UserDetails
        return userDetail.map(EmployeeInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }
    public String addUser(EmployeeInfo employeeInfo){
        employeeInfo.setPassword(encoder.encode(employeeInfo.getPassword()));
        employeeInfoRepo.save(employeeInfo);
        return "Employee added successfully...!";
    }
}
