package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "infra_schedule_tb")
@Getter
public class InfraSchedule {
    @EmbeddedId
    private InfraScheduleId id;

    @JoinColumn(name = "pet_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pet pet;

    @JoinColumn(name = "reservation_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reservation reservation;

    @Column(name = "remark")
    private String remark;

}
