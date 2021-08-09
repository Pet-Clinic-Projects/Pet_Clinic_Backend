package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDoctorSchedule is a Querydsl query type for DoctorSchedule
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDoctorSchedule extends EntityPathBase<DoctorSchedule> {

    private static final long serialVersionUID = -1953453915L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDoctorSchedule doctorSchedule = new QDoctorSchedule("doctorSchedule");

    public final QDoctorScheduleId id;

    public final NumberPath<Pet> pet = createNumber("pet", Pet.class);

    public final StringPath remark = createString("remark");

    public final NumberPath<Reservation> reservation = createNumber("reservation", Reservation.class);

    public QDoctorSchedule(String variable) {
        this(DoctorSchedule.class, forVariable(variable), INITS);
    }

    public QDoctorSchedule(Path<? extends DoctorSchedule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDoctorSchedule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDoctorSchedule(PathMetadata metadata, PathInits inits) {
        this(DoctorSchedule.class, metadata, inits);
    }

    public QDoctorSchedule(Class<? extends DoctorSchedule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QDoctorScheduleId(forProperty("id")) : null;
    }

}

