package org.umc_project.study.repository.userRepository;


import com.querydsl.core.Tuple;

import java.util.Optional;

public interface UserRepositoryCustom {
    Tuple findUserInfo (Long id);
    Integer findUserPoint(Long id);
}
