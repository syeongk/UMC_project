package org.umc_project.study.service.userService;

import com.querydsl.core.Tuple;

import java.util.Optional;

public interface UserQueryService {

    Optional<Tuple> findUserInfoById(Long id);
    Integer findUserPointById(Long id);
}
