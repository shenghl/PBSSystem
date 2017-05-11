package pbs.base.dao.mapper;

import java.util.List;

import pbs.base.pojo.vo.PbsAppUserInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;

public interface PbsRentInfoMapperCustom {
	//查询站点列表
	public List<PbsRentInfoCustom> findPbsRentInfoList(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception;
	//查询站点数条目数
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception;
	
	
	
	
	//查询调度列表
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	//查询调度数据条目数
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	//插入调度信息
	public int savePbsDispacherInfo(PbsDispacherInfoCustom PbsDispacherInfoCustom ) throws Exception;
	//调度任务的完成操作
	public int updateDispacher(PbsDispacherInfoCustom PbsDispacherInfoCustom) throws Exception;
	
	
	
	//app用户注册
	public int addPbsAppUserInfo(PbsAppUserInfoCustom pbsAppUserInfoCustom ) throws Exception;
	//app用户登录验证
	public PbsAppUserInfoCustom findAppUserByAccount(String account) throws Exception;

}