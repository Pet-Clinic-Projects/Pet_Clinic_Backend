package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInfraSchedule is a Querydsl query type for InfraSchedule
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInfraSchedule extends EntityPathBase<InfraSchedule> {

    private static final long serialVersionUID = -2058292520L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInfraSchedule infraSchedule = new QInfraSchedule("infraSchedule");

    public final QInfraScheduleId id;

    public final NumberPath<Pet> pet = createNumber("pet", Pet.class);

    public final StringPath remark = createString("remark");

    public final NumberPath<Reservation> reservation = createNumber("reservation", Reservation.class);

    public QInfraSchedule(String variable) {
        this(InfraSchedule.class, forVariable(variable), INITS);
    }

    public QInfraSchedule(Path<? extends InfraSchedule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInfraSchedule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInfraSchedule(PathMetadata metadata, PathInits inits) {
        this(InfraSchedule.class, metadata, inits);
    }

    public QInfraSchedule(Class<? extends InfraSchedule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QInfraScheduleId(forProperty("id"), inits.get("id")) : null;
    }

}

