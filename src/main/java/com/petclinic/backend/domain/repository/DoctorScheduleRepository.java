package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.DoctorSchedule;
import com.petclinic.backend.domain.entity.DoctorScheduleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, DoctorScheduleId> {
}
