package com.petclinic.backend.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMedicalHistory is a Querydsl query type for MedicalHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMedicalHistory extends EntityPathBase<MedicalHistory> {

    private static final long serialVersionUID = 341195922L;

    public static final QMedicalHistory medicalHistory = new QMedicalHistory("medicalHistory");

    public final StringPath amount = createString("amount");

    public final StringPath by = createString("by");

    public final NumberPath<Code> code = createNumber("code", Code.class);

    public final StringPath description = createString("description");

    public final NumberPath<Doctor> doctor = createNumber("doctor", Doctor.class);

    public final DateTimePath<java.time.LocalDateTime> historyTS = createDateTime("historyTS", java.time.LocalDateTime.class);

    public final NumberPath<Hospital> hospital = createNumber("hospital", Hospital.class);

    public final StringPath id = createString("id");

    public final StringPath journal = createString("journal");

    public final NumberPath<Pet> pet = createNumber("pet", Pet.class);

    public final StringPath photo = createString("photo");

    public final StringPath qty = createString("qty");

    public final NumberPath<Type> type = createNumber("type", Type.class);

    public final NumberPath<UserGroup> usergroup = createNumber("usergroup", UserGroup.class);

    public final StringPath variance = createString("variance");

    public final StringPath xls = createString("xls");

    public final StringPath zip = createString("zip");

    public QMedicalHistory(String variable) {
        super(MedicalHistory.class, forVariable(variable));
    }

    public QMedicalHistory(Path<? extends MedicalHistory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMedicalHistory(PathMetadata metadata) {
        super(MedicalHistory.class, metadata);
    }

}

