package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.HospitalHistory;
import com.petclinic.backend.domain.entity.HospitalHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalHistoryRepository extends JpaRepository<HospitalHistory, HospitalHistoryId> {
}
