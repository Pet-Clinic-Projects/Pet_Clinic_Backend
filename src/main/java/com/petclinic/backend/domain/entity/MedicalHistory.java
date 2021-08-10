package com.petclinic.backend.domain.entity;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MEDICAL_HISTORY_TB")
@Getter
public class MedicalHistory {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @JoinColumn(name = "DOCTOR_ID")
    @ManyToOne
    private Doctor doctor;

    @JoinColumn(name = "PET_ID")
    @ManyToOne
    private Pet pet;

    @JoinColumn(name = "HOSPITAL_ID")
    @ManyToOne
    private Hospital hospital;

    @Column(name = "HISTORY_TS")
    private LocalDateTime historyTS;

    @JoinColumn(name = "TYPE_CD")
    @ManyToOne
    private Type type;

    @JoinColumn(name = "CODE_CD")
    @ManyToOne
    private Code code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "QTY")
    private String qty;

    @Column(name = "AMOUNT")
    private String amount;

    @Column(name = "BY")
    private String by;

    @Column(name = "PHOTO")
    private String photo;

    @Column(name = "XLS")
    private String xls;

    @Column(name = "VARIANCE")
    private String variance;

    @Column(name = "JOURNAL")
    private String journal;

    @Column(name = "ZIP")
    private String zip;

}