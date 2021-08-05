package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Meta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaRepository extends JpaRepository<Meta, String> {
}
