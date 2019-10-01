package service;

import java.util.List;

import vo.ReviewVO;

public interface ReviewService {
	
	List<ReviewVO> reviewList(int fid);
	int addReview(ReviewVO vo) throws Exception;
}
