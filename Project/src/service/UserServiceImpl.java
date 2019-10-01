package service;

import java.util.List;

import dao.UserDao;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	UserDao dao;
	
	public UserServiceImpl() {}
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}
	
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int addUser(UserVO vo) {
		return dao.insertUser(vo);
	}

	@Override
	public int updateUser(UserVO vo) {
		return dao.updateUser(vo);
	}

	@Override
	public List<UserVO> UserList() {
		return dao.getUsersRec();
	}

	@Override
	public UserVO login(UserVO vo){
		return dao.login(vo);
	}

}