package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.DoctorHistory;
import com.petclinic.backend.domain.entity.DoctorHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorHistoryRepository extends JpaRepository<DoctorHistory, DoctorHistoryId> {
}
