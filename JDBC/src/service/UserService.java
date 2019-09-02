package service;

import vo.UserVO;

public interface UserService {
	int insertUser(UserVO user);
	int UpdateUser(UserVO user);
	boolean LoginUser(UserVO user);
}
