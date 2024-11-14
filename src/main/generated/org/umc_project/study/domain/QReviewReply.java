package org.umc_project.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReviewReply is a Querydsl query type for ReviewReply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewReply extends EntityPathBase<ReviewReply> {

    private static final long serialVersionUID = 49906528L;

    public static final QReviewReply reviewReply = new QReviewReply("reviewReply");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QReviewReply(String variable) {
        super(ReviewReply.class, forVariable(variable));
    }

    public QReviewReply(Path<? extends ReviewReply> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReviewReply(PathMetadata metadata) {
        super(ReviewReply.class, metadata);
    }

}

