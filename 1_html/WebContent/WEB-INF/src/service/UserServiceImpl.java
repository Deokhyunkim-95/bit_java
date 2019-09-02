package service;

import DAO.UserDao;
import VO.UserVO;

public class UserServiceImpl implements UserService{
	
	UserDao dao;
	
	
	public UserServiceImpl() {}

	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	
	@Override
	public int insertUser(UserVO user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	@Override
	public int UpdateUser(UserVO user) {
		// TODO Auto-generated method stub
		return dao.UpdateUser(user);
	}

	@Override
	public boolean LoginUser(UserVO user) {
		// TODO Auto-generated method stub
		return dao.LoginUser(user);
	}

}
