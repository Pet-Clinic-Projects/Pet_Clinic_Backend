package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.EmployeeHis;
import com.petclinic.backend.domain.entity.EmployeeHisId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeHisRepository extends JpaRepository<EmployeeHis, EmployeeHisId> {
}
