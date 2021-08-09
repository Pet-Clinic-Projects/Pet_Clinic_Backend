package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QInfra is a Querydsl query type for Infra
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInfra extends EntityPathBase<Infra> {

    private static final long serialVersionUID = 691711265L;

    public static final QInfra infra = new QInfra("infra");

    public final StringPath description = createString("description");

    public final NumberPath<Hospital> hospital = createNumber("hospital", Hospital.class);

    public final StringPath id = createString("id");

    public final NumberPath<Integer> maxWeight = createNumber("maxWeight", Integer.class);

    public final StringPath name = createString("name");

    public QInfra(String variable) {
        super(Infra.class, forVariable(variable));
    }

    public QInfra(Path<? extends Infra> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInfra(PathMetadata metadata) {
        super(Infra.class, metadata);
    }

}

