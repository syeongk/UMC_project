package org.umc_project.study.repository.userRepository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.umc_project.study.domain.QUser;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;
    private final QUser user = QUser.user;

    @Override
    public Tuple findUserInfo(Long id){

        return jpaQueryFactory
                .select(user.nickname, user.email, user.phone, user.point)
                .from(user)
                .where(user.id.eq(id))
                .fetchOne();
    }

    @Override
    public Integer findUserPoint(Long id){

        return jpaQueryFactory
                .select(user.point)
                .from(user)
                .where(user.id.eq(id))
                .fetchOne();
    }
}
