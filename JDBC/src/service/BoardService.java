package service;

import VO.BoardVO;

public interface BoardService {

	int insertBoard(BoardVO board);
	int UpdateBoard(BoardVO board);
	int DeleteBoard(BoardVO board);
	
}