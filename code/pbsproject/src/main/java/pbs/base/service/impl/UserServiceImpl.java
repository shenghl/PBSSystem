package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsUserInfoMapper;
import pbs.base.pojo.po.PbsUserInfo;
import pbs.base.pojo.po.PbsUserInfoExample;
import pbs.base.pojo.vo.ActiveUser;
import pbs.base.process.context.Config;
import pbs.base.process.result.ResultUtil;
import pbs.base.service.UserService;
import pbs.util.MD5;

public class UserServiceImpl implements UserService {

	@Autowired
	private PbsUserInfoMapper pbsUserInfoMapper;
	// 根据账号查询用户方法
		public PbsUserInfo findSysuserByUserid(String userId) throws Exception {
			PbsUserInfoExample pbsUserInfoExample = new PbsUserInfoExample();
			PbsUserInfoExample.Criteria criteria = pbsUserInfoExample.createCriteria();
			criteria.andUseridEqualTo(userId);
			List<PbsUserInfo> list = pbsUserInfoMapper.selectByExample(pbsUserInfoExample);
			if (list != null && list.size() == 1) {
				return list.get(0);
			}
			return null;
		}
		
	@Override
	public ActiveUser checkUserInfo(String userid, String pwd) throws Exception {
		PbsUserInfo pbsUserInfo = this.findSysuserByUserid(userid);
		if(pbsUserInfo == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101, null));
		}
		
		//校验用户密码是否合法
		String pwd_db = pbsUserInfo.getPwd();
		String pwd_md5 = new MD5().getMD5ofStr(pwd);
		
		if(!pwd_md5.equalsIgnoreCase(pwd_db)){
			//密码错误
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 114, null));
		}
		
		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(userid);
		activeUser.setUsername(pbsUserInfo.getUsername());
		//activeUser.setGroupid(pbsUserInfo.getGroupid());
		
		return activeUser;
	}

}
