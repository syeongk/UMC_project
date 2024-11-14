package org.umc_project.study.repository.missionRepository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.umc_project.study.domain.QMission;
import org.umc_project.study.domain.QRegion;
import org.umc_project.study.domain.QShop;
import org.umc_project.study.domain.mapping.QUserMission;

import java.time.LocalDateTime;
import java.util.List;

import static org.umc_project.study.domain.enums.UserMissionStatus.IN_PROGRESS;
import static org.umc_project.study.domain.enums.UserMissionStatus.PENDING;

@Repository
@RequiredArgsConstructor
public class MissionRepositoryImpl implements MissionRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;
    private final QMission mission = QMission.mission;
    private final QShop shop = QShop.shop;
    private final QRegion region = QRegion.region;
    private final QUserMission userMission = QUserMission.userMission;

    @Override
    public List<Tuple> findUserMissionsFirst(Long id){

        return jpaQueryFactory
                .select(mission.content, mission.point, mission.successCriteria, userMission.status, userMission.createdAt, shop.name)
                .from(mission)
                .join(userMission).on(mission.id.eq(userMission.mission.id))
                .join(shop).on(mission.shop.id.eq(shop.id))
                .where(userMission.user.id.eq(id).and(userMission.status.eq(IN_PROGRESS)))
                .orderBy(userMission.createdAt.desc())
                .limit(3)
                .fetch();
    }


    @Override
    public List<Tuple> findUserMissionsNext(Long id, Tuple lastTuple){

        LocalDateTime createdAt = lastTuple.get(userMission.createdAt);

        return jpaQueryFactory
                .select(mission.content, mission.point, mission.successCriteria, userMission.status, shop.name)
                .from(mission)
                .join(userMission).on(mission.id.eq(userMission.mission.id))
                .join(shop).on(mission.shop.id.eq(shop.id))
                .where(userMission.user.id.eq(id).and(userMission.status.eq(IN_PROGRESS)).and(userMission.createdAt.lt(createdAt)))
                .orderBy(userMission.createdAt.desc())
                .limit(3)
                .fetch();
    }

    @Override
    public List<Tuple> findPendingMissionFirst(Long id, String regionName){

        return jpaQueryFactory
                .select(mission.content, mission.duration, mission.successCriteria, mission.point, mission.createdAt, region.name)
                .from(mission)
                .join(userMission).on(mission.id.eq(userMission.mission.id))
                .join(shop).on(mission.shop.id.eq(shop.id))
                .join(region).on(region.id.eq(shop.region.id))
                .where(userMission.user.id.eq(id).and(userMission.status.eq(PENDING)).and(region.name.eq(regionName)))
                .orderBy(mission.createdAt.asc())
                .limit(2)
                .fetch();
    }

    @Override
    public List<Tuple> findPendingMissionNext(Long id, String regionName, Tuple lastTuple){

        LocalDateTime createdAt = lastTuple.get(mission.createdAt);
        System.out.println(createdAt);

        return jpaQueryFactory
                .select(mission.content, mission.duration, mission.successCriteria, mission.point, region.name)
                .from(mission)
                .join(userMission).on(mission.id.eq(userMission.mission.id))
                .join(shop).on(mission.shop.id.eq(shop.id))
                .join(region).on(region.id.eq(shop.region.id))
                .where(userMission.user.id.eq(id).and(userMission.status.eq(PENDING)).and(region.name.eq(regionName)).and(mission.createdAt.gt(createdAt)))
                .orderBy(mission.createdAt.asc())
                .limit(2)
                .fetch();
    }
}
