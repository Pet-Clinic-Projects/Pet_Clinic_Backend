package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.UserGroup;
import com.petclinic.backend.domain.entity.UserGroupRel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@Repository
public interface UserGroupRelRepository extends JpaRepository<UserGroupRel, String> {

}
