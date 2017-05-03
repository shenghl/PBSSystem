package pbs.base.dao.mapper;

import java.util.List;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;

public interface PbsDispacherInfoMapperCustom {
	//查询调度列表
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	
	//查询调度数据条目数
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception;
	
	//添加
	public int savePbsDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom ) throws Exception;
}


