package org.umc_project.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserSocial is a Querydsl query type for UserSocial
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserSocial extends EntityPathBase<UserSocial> {

    private static final long serialVersionUID = 159732842L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserSocial userSocial = new QUserSocial("userSocial");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    public final StringPath access_token = createString("access_token");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> expiredAt = createDateTime("expiredAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath provider = createString("provider");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUser user;

    public QUserSocial(String variable) {
        this(UserSocial.class, forVariable(variable), INITS);
    }

    public QUserSocial(Path<? extends UserSocial> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserSocial(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserSocial(PathMetadata metadata, PathInits inits) {
        this(UserSocial.class, metadata, inits);
    }

    public QUserSocial(Class<? extends UserSocial> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

