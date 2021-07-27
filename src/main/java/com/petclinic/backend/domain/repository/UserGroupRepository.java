package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.UserGroup;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository


public interface UserGroupRepository extends JpaRepository<UserGroup, String> {

}
