package org.umc_project.study.service.missionService;

import com.querydsl.core.Tuple;

import java.util.List;
import java.util.Optional;

public interface MissionQueryService {
    List<Tuple> getUserMissionsFirst(Long id);

    List<Tuple> getUserMissionsNext(Long id, Tuple lastTuple);

    List<Tuple> getPendingMissionsFirst(Long id, String regionName);

    List<Tuple> getPendingMissionsNext(Long id, String regionName, Tuple lastTuple);
}
