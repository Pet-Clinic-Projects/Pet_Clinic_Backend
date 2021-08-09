package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.DoctorReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorReservationRepository extends JpaRepository<DoctorReservation, String> {
}
