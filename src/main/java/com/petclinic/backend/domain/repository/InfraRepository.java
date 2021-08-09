package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Infra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfraRepository extends JpaRepository<Infra, String> {

}
