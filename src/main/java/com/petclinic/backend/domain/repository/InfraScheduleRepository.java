package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.InfraSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfraScheduleRepository extends JpaRepository<InfraSchedule, String> {
}
