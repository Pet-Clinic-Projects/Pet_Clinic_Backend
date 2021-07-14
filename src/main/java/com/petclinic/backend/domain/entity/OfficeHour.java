package com.petclinic.backend.domain.entity;

import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "office_hour_tb")
@Getter
public class OfficeHour {
    @EmbeddedId
    private OfficeHourId id;

    @Column(name = "open_hour")
    @NotNull
    private LocalDateTime open;

    @Column(name = "close_hour")
    @NotNull
    private LocalDateTime close;
}
