package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.DoctorSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, String> {
}
