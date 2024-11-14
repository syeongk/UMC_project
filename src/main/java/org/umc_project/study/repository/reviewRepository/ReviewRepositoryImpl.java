package org.umc_project.study.repository.reviewRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.umc_project.study.domain.QReview;
import org.umc_project.study.domain.Review;


@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl {

    private final JPAQueryFactory jpaQueryFactory;
    private final EntityManager entityManager;
    private final QReview review = QReview.review;

}
