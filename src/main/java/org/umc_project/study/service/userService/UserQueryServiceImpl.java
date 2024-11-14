package org.umc_project.study.service.userService;

import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.umc_project.study.domain.QUser;
import org.umc_project.study.repository.userRepository.UserRepository;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {
    
    private final UserRepository userRepository;
    private final QUser user = QUser.user;
    
    @Override
    public Optional<Tuple> findUserInfoById(Long id){
        Tuple userInfo = userRepository.findUserInfo(id);

        if (userInfo != null) {
            System.out.println(userInfo.get(user.nickname) + " " +
                    userInfo.get(user.email) + " " +
                    userInfo.get(user.phone) + " " +
                    userInfo.get(user.point));
        }

        return Optional.ofNullable(userInfo);
    }

    @Override
    public Integer findUserPointById(Long id){

        Integer point = userRepository.findUserPoint(id);
        System.out.println(point);

        return point;
    }
}
