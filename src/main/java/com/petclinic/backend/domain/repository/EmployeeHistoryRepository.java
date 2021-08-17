package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.EmployeeHistory;
import com.petclinic.backend.domain.entity.EmployeeHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeHistoryRepository extends JpaRepository<EmployeeHistory, EmployeeHistoryId> {
}
