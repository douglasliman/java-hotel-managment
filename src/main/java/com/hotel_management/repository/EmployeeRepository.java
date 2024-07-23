package com.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel_management.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
