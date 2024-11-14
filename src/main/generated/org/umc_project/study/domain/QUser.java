package org.umc_project.study.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -555124067L;

    public static final QUser user = new QUser("user");

    public final org.umc_project.study.domain.common.QBaseEntity _super = new org.umc_project.study.domain.common.QBaseEntity(this);

    public final DatePath<java.time.LocalDate> birth = createDate("birth", java.time.LocalDate.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath detailed_address = createString("detailed_address");

    public final StringPath email = createString("email");

    public final EnumPath<org.umc_project.study.domain.enums.Gender> gender = createEnum("gender", org.umc_project.study.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> inactiveDate = createDate("inactiveDate", java.time.LocalDate.class);

    public final ListPath<Inquiry, QInquiry> InquiryList = this.<Inquiry, QInquiry>createList("InquiryList", Inquiry.class, QInquiry.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final ListPath<Notification, QNotification> NotificationList = this.<Notification, QNotification>createList("NotificationList", Notification.class, QNotification.class, PathInits.DIRECT2);

    public final StringPath phone = createString("phone");

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final StringPath primary_address = createString("primary_address");

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public final BooleanPath terms_agreement = createBoolean("terms_agreement");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final ListPath<org.umc_project.study.domain.mapping.UserMission, org.umc_project.study.domain.mapping.QUserMission> userMissionList = this.<org.umc_project.study.domain.mapping.UserMission, org.umc_project.study.domain.mapping.QUserMission>createList("userMissionList", org.umc_project.study.domain.mapping.UserMission.class, org.umc_project.study.domain.mapping.QUserMission.class, PathInits.DIRECT2);

    public final ListPath<UserSocial, QUserSocial> userSocialList = this.<UserSocial, QUserSocial>createList("userSocialList", UserSocial.class, QUserSocial.class, PathInits.DIRECT2);

    public final EnumPath<org.umc_project.study.domain.enums.UserStatus> userStatus = createEnum("userStatus", org.umc_project.study.domain.enums.UserStatus.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

