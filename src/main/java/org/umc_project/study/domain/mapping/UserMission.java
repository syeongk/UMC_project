package org.umc_project.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.User;
import org.umc_project.study.domain.common.BaseEntity;
import org.umc_project.study.domain.enums.UserMissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(20) DEFAULT 'PENDING'")
    private UserMissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

}
