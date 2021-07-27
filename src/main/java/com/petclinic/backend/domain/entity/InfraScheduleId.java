package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Embeddable
@Getter
public class InfraScheduleId {
    @Column(name = "schedule_ts")
    private LocalDateTime scheduleTS;

    @JoinColumn(name = "infra_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Infra infra;

    public InfraScheduleId(LocalDateTime scheduleTS, Infra infra){
        this.scheduleTS = scheduleTS;
        this.infra = infra;
    }
}
