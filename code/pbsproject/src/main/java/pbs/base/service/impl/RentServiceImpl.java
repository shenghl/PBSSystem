package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsRentInfoMapperCustom;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.service.RentService;

public class RentServiceImpl implements RentService{

	@Autowired
	PbsRentInfoMapperCustom pbsRentInfoMapperCustom;
	
	@Override
	public List<PbsRentInfoCustom> findPbsRentInfoList(
			PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception {
		return pbsRentInfoMapperCustom.findPbsRentInfoList(pbsRentInfoQueryVo);
	}

	@Override
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo)
			throws Exception {
		return pbsRentInfoMapperCustom.findPbsRentInfoCount(pbsRentInfoQueryVo);
	}

}
