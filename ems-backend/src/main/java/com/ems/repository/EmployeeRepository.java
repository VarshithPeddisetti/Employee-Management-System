package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
