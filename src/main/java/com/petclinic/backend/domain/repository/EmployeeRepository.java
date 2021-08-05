package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
