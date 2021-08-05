package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.DoctorHis;
import com.petclinic.backend.domain.entity.DoctorHisId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorHisRepository extends JpaRepository<DoctorHis, DoctorHisId> {
}
