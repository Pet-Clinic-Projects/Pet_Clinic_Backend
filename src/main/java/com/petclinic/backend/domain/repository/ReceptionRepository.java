package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionRepository extends JpaRepository<Reception, String> {
}
