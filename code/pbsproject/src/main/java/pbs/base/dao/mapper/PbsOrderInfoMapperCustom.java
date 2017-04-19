package pbs.base.dao.mapper;

import java.util.List;

import pbs.base.pojo.vo.PbsOrderInfoCustom;
import pbs.base.pojo.vo.PbsOrderInfoQueryVo;

public interface PbsOrderInfoMapperCustom {

	public List<PbsOrderInfoCustom> findPbsOrderInfoList(PbsOrderInfoQueryVo pbsOrderInfoQueryVo) throws Exception;
	
	public int findPbsOrderInfoCount(PbsOrderInfoQueryVo pbsOrderInfoQueryVo) throws Exception;
}