package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.CodeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeGroupRepository extends JpaRepository<CodeGroup, String> {
}
