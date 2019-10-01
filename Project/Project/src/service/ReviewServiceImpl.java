package service;

import java.util.List;

import dao.ReviewDAO;
import vo.ReviewVO;

public class ReviewServiceImpl implements ReviewService{
	
	ReviewDAO dao;
	
	public ReviewServiceImpl() {}
	public ReviewServiceImpl(ReviewDAO dao) {
		this.dao = dao;
	}
	
	public ReviewDAO getDao() {
		return dao;
	}
	public void setDao(ReviewDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<ReviewVO> reviewList(int fid) {
		return dao.getReviewRec(fid);
	}

	@Override
	public int addReview(ReviewVO vo) throws Exception {
		return dao.insertReview(vo);
	}


}
