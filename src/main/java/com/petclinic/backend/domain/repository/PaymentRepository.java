package com.petclinic.backend.domain.repository;

import com.petclinic.backend.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
