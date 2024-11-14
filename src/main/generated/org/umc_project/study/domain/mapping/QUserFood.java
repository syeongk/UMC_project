package org.umc_project.study.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserFood is a Querydsl query type for UserFood
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserFood extends EntityPathBase<UserFood> {

    private static final long serialVersionUID = 814379963L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserFood userFood = new QUserFood("userFood");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final org.umc_project.study.domain.QFood food;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final org.umc_project.study.domain.QUser user;

    public QUserFood(String variable) {
        this(UserFood.class, forVariable(variable), INITS);
    }

    public QUserFood(Path<? extends UserFood> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserFood(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserFood(PathMetadata metadata, PathInits inits) {
        this(UserFood.class, metadata, inits);
    }

    public QUserFood(Class<? extends UserFood> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.food = inits.isInitialized("food") ? new org.umc_project.study.domain.QFood(forProperty("food")) : null;
        this.user = inits.isInitialized("user") ? new org.umc_project.study.domain.QUser(forProperty("user")) : null;
    }

}

