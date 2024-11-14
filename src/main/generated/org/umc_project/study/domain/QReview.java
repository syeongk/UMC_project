package org.umc_project.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -996599382L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMission mission;

    public final NumberPath<Float> rating = createNumber("rating", Float.class);

    public final ListPath<ReviewImage, QReviewImage> reviewImageList = this.<ReviewImage, QReviewImage>createList("reviewImageList", ReviewImage.class, QReviewImage.class, PathInits.DIRECT2);

    public final QReviewReply reviewReply;

    public final QShop shop;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUser user;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mission = inits.isInitialized("mission") ? new QMission(forProperty("mission"), inits.get("mission")) : null;
        this.reviewReply = inits.isInitialized("reviewReply") ? new QReviewReply(forProperty("reviewReply")) : null;
        this.shop = inits.isInitialized("shop") ? new QShop(forProperty("shop"), inits.get("shop")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

