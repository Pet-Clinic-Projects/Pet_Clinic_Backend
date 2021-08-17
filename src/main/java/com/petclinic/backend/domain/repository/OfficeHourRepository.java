package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.OfficeHour;
import com.petclinic.backend.domain.entity.OfficeHourId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeHourRepository extends JpaRepository<OfficeHour, OfficeHourId> {
}
