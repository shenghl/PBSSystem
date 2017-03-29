package pbs.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsBikeInfoMapper;
import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.service.BikeInfoService;

public class BikeInfoServiceImpl implements BikeInfoService {

	@Autowired
	private PbsBikeInfoMapper pbsBikeInfoMapper;
	
	@Override
	public PbsBikeInfo findBikeInfoById(int id) throws Exception {
		return pbsBikeInfoMapper.selectByPrimaryKey(id);
	}

}
