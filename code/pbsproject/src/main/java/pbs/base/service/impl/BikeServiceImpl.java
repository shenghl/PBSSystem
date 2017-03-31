package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsBikeInfoMapperCustom;
import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.service.BikeService;

public class BikeServiceImpl implements BikeService {

	@Autowired
	private PbsBikeInfoMapperCustom pbsBikeInfoMapperCustom;
	
	@Override
	public List<PbsBikeInfoCustom> findPbsBikeInfoList(
			PbsBikeInfoQueryVo pbsBikeInfoQueryVo) throws Exception {
		return pbsBikeInfoMapperCustom.findPbsBikeInfoList(pbsBikeInfoQueryVo);
	}

}
