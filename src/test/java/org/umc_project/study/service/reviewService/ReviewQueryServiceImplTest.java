package org.umc_project.study.service.reviewService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.umc_project.study.domain.Review;
import org.umc_project.study.repository.reviewRepository.ReviewRepository;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class ReviewQueryServiceImplTest {

    @Mock
    private ReviewRepository reviewRepository;

    @InjectMocks
    private ReviewQueryServiceImpl reviewQueryService;

    public ReviewQueryServiceImplTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateReview() {
        // Given: 리뷰 객체를 생성
        Review review = new Review(1L, 4F, "맛있네요", null, null, null, null, null);

        // When: createReview 메서드 호출
        reviewQueryService.createReview(review);

        // Then: reviewRepository의 save 메서드가 호출되었는지 확인
        verify(reviewRepository, times(1)).save(any(Review.class));
    }
}