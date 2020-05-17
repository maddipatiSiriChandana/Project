package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
