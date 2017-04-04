package pbs.base.service;

import pbs.base.pojo.vo.ActiveUser;

public interface UserService {

	
	//校验用户信息
	public ActiveUser checkUserInfo(String userid,String pwd)throws Exception;
}
