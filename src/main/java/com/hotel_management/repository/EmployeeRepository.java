package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
