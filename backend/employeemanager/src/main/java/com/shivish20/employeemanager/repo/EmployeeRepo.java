package com.shivish20.employeemanager.repo;

import java.util.Optional;

import com.shivish20.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

   void deleteEmployeeById(Long id);

   Optional<Employee> findEmployeeById(Long id);

}
