package com.petclinic.backend.domain.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import com.petclinic.backend.domain.entity.User;

import java.util.List;

@Repository


public interface UserRepository extends JpaRepository<User, String> {

}