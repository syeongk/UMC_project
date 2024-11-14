package org.umc_project;

import com.querydsl.core.Tuple;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.umc_project.study.service.missionService.MissionQueryService;
import org.umc_project.study.service.shopService.ShopQueryService;
import org.umc_project.study.service.userService.UserQueryService;

import java.util.List;


@SpringBootApplication
@EnableJpaAuditing
public class UmcProjectApplication {


    public static void main(String[] args) {
        SpringApplication.run(UmcProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {
            ShopQueryService storeService = context.getBean(ShopQueryService.class);
            UserQueryService userService = context.getBean(UserQueryService.class);
            MissionQueryService missionService = context.getBean(MissionQueryService.class);

            String name = "요아정";
            Float rating = 4.0f;

            System.out.println("Executing findStoresByNameAndScore with parameters:");
            System.out.println("Name: " + name);
            System.out.println("Rating: " + rating);

            storeService.findShopsByNameAndRating(name, rating)
                    .forEach(System.out::println);

            userService.findUserInfoById(1L);

            List<Tuple> missions = missionService.getUserMissionsFirst(1L);
            if (!missions.isEmpty()) {
                Tuple lastTuple = missions.get(missions.size() - 1);
                missionService.getUserMissionsNext(1L, lastTuple);
            }

            userService.findUserPointById(100L);


            List<Tuple> pendingMissions = missionService.getPendingMissionsFirst(100L, "안암동");
            if (!pendingMissions.isEmpty()) {
                Tuple lastTuple = pendingMissions.get(pendingMissions.size() - 1);
                missionService.getPendingMissionsNext(1L, "안암동", lastTuple);
            }


        };
    }
}
