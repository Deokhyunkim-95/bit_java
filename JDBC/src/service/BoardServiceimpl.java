package service;

import java.util.List;

import DAO.BoardDao;
import VO.BoardVO;

public class BoardServiceimpl implements BoardService{

	BoardDao dao;

	
	
	
	public BoardServiceimpl() {	}

	public BoardServiceimpl(BoardDao dao) {
		super();
		this.dao = dao;
	}


	public BoardDao getDao() {
		return dao;
	}


	public void setDao(BoardDao dao) {
		this.dao = dao;
	}



	@Override
	public int insertBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return dao.insertBoard(board);
	}

	@Override
	public int UpdateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return dao.UpdateBoard(board);
	}

	@Override
	public int DeleteBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return dao.DeleteBoard(board);
	}
	
		
	
}