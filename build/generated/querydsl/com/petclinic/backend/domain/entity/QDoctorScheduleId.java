package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDoctorScheduleId is a Querydsl query type for DoctorScheduleId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QDoctorScheduleId extends BeanPath<DoctorScheduleId> {

    private static final long serialVersionUID = -368501600L;

    public static final QDoctorScheduleId doctorScheduleId = new QDoctorScheduleId("doctorScheduleId");

    public final NumberPath<Doctor> doctor = createNumber("doctor", Doctor.class);

    public final DateTimePath<java.time.LocalDateTime> scheduleTS = createDateTime("scheduleTS", java.time.LocalDateTime.class);

    public QDoctorScheduleId(String variable) {
        super(DoctorScheduleId.class, forVariable(variable));
    }

    public QDoctorScheduleId(Path<? extends DoctorScheduleId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDoctorScheduleId(PathMetadata metadata) {
        super(DoctorScheduleId.class, metadata);
    }

}

