package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.HospitalHis;
import com.petclinic.backend.domain.entity.HospitalHisId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalHisRepository extends JpaRepository<HospitalHis, HospitalHisId> {
}
