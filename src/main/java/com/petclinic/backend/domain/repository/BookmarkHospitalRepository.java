package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.BookmarkHospital;
import com.petclinic.backend.domain.entity.BookmarkHospitalId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkHospitalRepository extends JpaRepository<BookmarkHospital, BookmarkHospitalId> {
}
