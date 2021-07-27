package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_tb")
@Getter
public class Payment {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @JoinColumn(name = "reception_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reception reception;

    @Column(name = "collection_ts")
    private LocalDateTime collectionTS;

    @Column(name = "charging_ts")
    private LocalDateTime chargingTS;

    @Column(name = "charging_name")
    private String chargingName;

    @Column(name = "charging_fee")
    private String chargingFee;

    @JoinColumn(name = "payment_type_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code paymentType;

}
