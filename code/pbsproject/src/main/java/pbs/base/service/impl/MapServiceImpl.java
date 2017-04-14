package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsRentInfoMapper;
import pbs.base.dao.mapper.PbsRentInfoMapperCustom;
import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.pojo.po.PbsBikeInfoExample;
import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.po.PbsRentInfoExample;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.service.MapService;

public class MapServiceImpl implements MapService{
	
	@Autowired
	private PbsRentInfoMapper pbsRentInfoMapper;
	
	@Autowired
	private PbsRentInfoMapperCustom pbsRentInfoMapperCustom;
	
	@Override
	public List<PbsRentInfoCustom> findPbsRentInfoList(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception {
		return pbsRentInfoMapperCustom.findPbsRentInfoList(pbsRentInfoQueryVo);
	}

	@Override
	//
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception {
		return pbsRentInfoMapperCustom.findPbsRentInfoCount(pbsRentInfoQueryVo);
	}

	@Override
	//根据Id查询
	public PbsRentInfo findPbsRentInfoById(int id)
			throws Exception {
		PbsRentInfoExample pbsRentInfoExample = new PbsRentInfoExample();
		PbsRentInfoExample.Criteria criteria = pbsRentInfoExample.createCriteria();
		//设置查询条件
		criteria.andIdEqualTo(id);
		List<PbsRentInfo> list = pbsRentInfoMapper.selectByExample(pbsRentInfoExample);
		
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}
}
