package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.UserPetRel;
import com.petclinic.backend.domain.entity.UserPetRelID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPetRelRepository extends JpaRepository<UserPetRel,UserPetRelID> {
}
