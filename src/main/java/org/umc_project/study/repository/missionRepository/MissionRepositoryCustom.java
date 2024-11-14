package org.umc_project.study.repository.missionRepository;

import com.querydsl.core.Tuple;

import java.util.List;

public interface MissionRepositoryCustom {

    List<Tuple> findUserMissionsFirst(Long id);

    List<Tuple> findUserMissionsNext(Long id, Tuple lastTuple);

    List<Tuple> findPendingMissionFirst(Long id, String regionName);

    List<Tuple> findPendingMissionNext(Long id, String regionName, Tuple lastTuple);
}
