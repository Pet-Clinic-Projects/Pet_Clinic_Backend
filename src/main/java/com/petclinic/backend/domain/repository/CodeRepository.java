package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, String> {
}
