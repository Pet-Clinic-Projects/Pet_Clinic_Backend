package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository

public interface PetRepository extends JpaRepository<Pet, String> {

}
