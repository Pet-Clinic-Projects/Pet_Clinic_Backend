package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Infra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface InfraRepository extends JpaRepository<Infra, String> {
}
