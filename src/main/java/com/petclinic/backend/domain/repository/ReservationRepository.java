package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
