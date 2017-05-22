package pbs.business.service;

import java.util.List;

import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.vo.PbsAppUserInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.business.pojo.po.Locations;

public interface MapService {
	//查询站点信息，返回list集合
	public List<PbsRentInfoCustom> findPbsRentInfoList(PbsRentInfoQueryVo pbsRentInfoQueryVo) 
					throws Exception;
	
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception;
	
	public PbsRentInfo findPbsRentInfoById(int id) throws Exception;
	
	//将gps坐标转换为高德地图坐标
	public Locations convertLocations(String lat,String lng) throws Exception;
	
	
	//查询所有调度
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	//查询调度记录条目数
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	//添加调度信息
	public int savePbsDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom ) throws Exception;
	//app调度任务完成处理
	public int updataDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom ) throws Exception;
	
	
	//app用户注册
	public int addPbsAppUserInfo(PbsAppUserInfoCustom pbsAppUserInfoCustom ) throws Exception;
	//app用户登录验证
	public PbsAppUserInfoCustom findAppUserByAccount(String account,String password) throws Exception;
	//app用户密码修改
	public int updateAppUserChangePWD(String account,String oldpassword,String newpassword) throws Exception;

}
