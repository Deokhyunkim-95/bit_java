package service;

import VO.UserVO;

public interface UserService {
	int insertUser(UserVO user);
	int UpdateUser(UserVO user);
	boolean LoginUser(UserVO user);
}
