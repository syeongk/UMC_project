package org.umc_project.study.service.missionService;

import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.umc_project.study.repository.missionRepository.MissionRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MissionQueryServiceImpl implements MissionQueryService {

    private final MissionRepository missionRepository;

    @Override
    public List<Tuple> getUserMissionsFirst(Long id){

        List<Tuple> missions = missionRepository.findUserMissionsFirst(id);

        if (!missions.isEmpty()){
            missions.forEach(mission -> System.out.println(mission));
        } else {
            System.out.println("데이터가 없어요");
        }

        return missions;

    }

    @Override
    public List<Tuple> getUserMissionsNext(Long id, Tuple lastTuple){

        List<Tuple> missions = missionRepository.findUserMissionsNext(id, lastTuple);

        if (!missions.isEmpty()){
            missions.forEach(mission -> System.out.println(mission));
        } else {
            System.out.println("데이터가 없어요");
        }

        return missions;

    }

    @Override
    public List<Tuple> getPendingMissionsFirst(Long id, String regionName){

        List<Tuple> pendingMissions = missionRepository.findPendingMissionFirst(id, regionName);

        if (!pendingMissions.isEmpty()){
            pendingMissions.forEach(pendingMission -> System.out.println(pendingMission));
        } else {
            System.out.println("데이터가 없습니다.");
        }

        return pendingMissions;
    }


    @Override
    public List<Tuple> getPendingMissionsNext(Long id, String regionName, Tuple lastTuple){

        List<Tuple> pendingMissions = missionRepository.findPendingMissionNext(id, regionName, lastTuple);

        if (!pendingMissions.isEmpty()){
            pendingMissions.forEach(pendingMission -> System.out.println(pendingMission));
        } else {
            System.out.println("데이터가 없습니다.");
        }

        return pendingMissions;
    }


}
