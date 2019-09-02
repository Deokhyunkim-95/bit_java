package service;

import vo.BoardVO;

public interface BoardService {

	int insertBoard(BoardVO board);
	int UpdateBoard(BoardVO board);
	int DeleteBoard(BoardVO board);
	
}