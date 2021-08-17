package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, String> {
}
