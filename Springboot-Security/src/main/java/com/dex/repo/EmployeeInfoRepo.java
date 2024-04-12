package com.dex.repo;

import com.dex.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeInfoRepo extends JpaRepository<EmployeeInfo,Long> {

    //Optional<EmployeeInfo> findByName(@Param("name")String username);
    Optional<EmployeeInfo> findByName(String username);
}
