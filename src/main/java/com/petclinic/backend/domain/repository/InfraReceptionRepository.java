package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.InfraReception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfraReceptionRepository extends JpaRepository<InfraReception, String> {
}
