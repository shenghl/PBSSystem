package pbs.base.dao.mapper;

import java.util.List;

import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;

public interface PbsBikeInfoMapperCustom {

	public List<PbsBikeInfoCustom> findPbsBikeInfoList(PbsBikeInfoQueryVo pbsBikeInfoQueryVo) throws Exception;
	
	public int findPbsBikeInfoCount(PbsBikeInfoQueryVo pbsBikeInfoQueryVo) throws Exception;
}