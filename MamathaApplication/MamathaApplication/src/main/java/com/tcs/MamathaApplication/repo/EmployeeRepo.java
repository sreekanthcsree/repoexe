package com.tcs.MamathaApplication.repo;

import com.tcs.MamathaApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
   // void delete(int id);
}
