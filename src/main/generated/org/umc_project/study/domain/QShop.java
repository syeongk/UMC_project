package org.umc_project.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShop is a Querydsl query type for Shop
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShop extends EntityPathBase<Shop> {

    private static final long serialVersionUID = -555193912L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShop shop = new QShop("shop");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath detailed_address = createString("detailed_address");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Mission, QMission> missionList = this.<Mission, QMission>createList("missionList", Mission.class, QMission.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath primary_address = createString("primary_address");

    public final NumberPath<Float> rating = createNumber("rating", Float.class);

    public final QRegion region;

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final EnumPath<org.umc_project.study.domain.enums.ShopStatus> status = createEnum("status", org.umc_project.study.domain.enums.ShopStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QShop(String variable) {
        this(Shop.class, forVariable(variable), INITS);
    }

    public QShop(Path<? extends Shop> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShop(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShop(PathMetadata metadata, PathInits inits) {
        this(Shop.class, metadata, inits);
    }

    public QShop(Class<? extends Shop> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new QRegion(forProperty("region")) : null;
    }

}

