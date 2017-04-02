package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsBikeInfoMapper;
import pbs.base.dao.mapper.PbsBikeInfoMapperCustom;
import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.pojo.po.PbsBikeInfoExample;
import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.process.result.ResultInfo;
import pbs.base.service.BikeService;

public class BikeServiceImpl implements BikeService {

	@Autowired
	private PbsBikeInfoMapperCustom pbsBikeInfoMapperCustom;
	
	@Autowired
	private PbsBikeInfoMapper pbsBikeInfoMapper;
	
	@Override
	public List<PbsBikeInfoCustom> findPbsBikeInfoList(
			PbsBikeInfoQueryVo pbsBikeInfoQueryVo) throws Exception {
		return pbsBikeInfoMapperCustom.findPbsBikeInfoList(pbsBikeInfoQueryVo);
	}

	public PbsBikeInfo findPbsBikeInfoByBikebm(String bm) throws Exception {
		PbsBikeInfoExample pbsBikeInfoExample = new PbsBikeInfoExample();
		PbsBikeInfoExample.Criteria criteria = pbsBikeInfoExample.createCriteria();
		//设置查询条件
		criteria.andBmEqualTo(bm);
		List<PbsBikeInfo> list = pbsBikeInfoMapper.selectByExample(pbsBikeInfoExample);
		
		if(list != null && list.size() == 1){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public int findPbsBikeInfoCount(PbsBikeInfoQueryVo pbsBikeInfoQueryVo)
			throws Exception {
		return pbsBikeInfoMapperCustom.findPbsBikeInfoCount(pbsBikeInfoQueryVo);
	}

	@Override
	public void insertPbsBikeInfo(PbsBikeInfoCustom pbsBikeInfoCustom)
			throws Exception {
		PbsBikeInfo pbsBikeInfo = this.findPbsBikeInfoByBikebm(pbsBikeInfoCustom.getBm());

		if(pbsBikeInfo!=null){
			throw new Exception("编码重复");
		}
		
		pbsBikeInfoMapper.insert(pbsBikeInfoCustom);
	}

}
