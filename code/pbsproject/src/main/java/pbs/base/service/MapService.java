package pbs.base.service;

import java.util.List;

import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;

public interface MapService {
	//查询站点信息，返回list集合
	public List<PbsRentInfoCustom> findPbsRentInfoList(PbsRentInfoQueryVo pbsRentInfoQueryVo) 
					throws Exception;
	
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception;
	
	public PbsRentInfo findPbsRentInfoById(int id) throws Exception;

	//查询转换后的list集合
	public List<PbsRentInfoCustom> findConvertRentList(PbsRentInfoQueryVo pbsRentInfoQueryVo) 
			throws Exception;
}
