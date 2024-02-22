package com.dextris.repo;

import com.dextris.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo<Person> extends JpaRepository<Employee,Long> {

    static Employee findByEmail(String email) {
        return null;
    }
}
