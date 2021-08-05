package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
