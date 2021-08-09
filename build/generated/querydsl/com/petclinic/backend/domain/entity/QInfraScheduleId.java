package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInfraScheduleId is a Querydsl query type for InfraScheduleId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QInfraScheduleId extends BeanPath<InfraScheduleId> {

    private static final long serialVersionUID = 1960814099L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInfraScheduleId infraScheduleId = new QInfraScheduleId("infraScheduleId");

    public final QInfra infra;

    public final DateTimePath<java.time.LocalDateTime> scheduleTS = createDateTime("scheduleTS", java.time.LocalDateTime.class);

    public QInfraScheduleId(String variable) {
        this(InfraScheduleId.class, forVariable(variable), INITS);
    }

    public QInfraScheduleId(Path<? extends InfraScheduleId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInfraScheduleId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInfraScheduleId(PathMetadata metadata, PathInits inits) {
        this(InfraScheduleId.class, metadata, inits);
    }

    public QInfraScheduleId(Class<? extends InfraScheduleId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.infra = inits.isInitialized("infra") ? new QInfra(forProperty("infra")) : null;
    }

}

