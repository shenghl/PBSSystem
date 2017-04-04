package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsBikeInfoMapper;
import pbs.base.dao.mapper.PbsBikeInfoMapperCustom;
import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.pojo.po.PbsBikeInfoExample;
import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.process.context.Config;
import pbs.base.process.result.ExceptionResultInfo;
import pbs.base.process.result.ResultInfo;
import pbs.base.process.result.ResultUtil;
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
			//throw new Exception("编码重复");
			
			//使用系统自定义异常类
			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
			resultInfo.setMessage("编码重复");
			throw new ExceptionResultInfo(resultInfo);
		}
		
		pbsBikeInfoMapper.insert(pbsBikeInfoCustom);
	}

	@Override
	public void deletPbsBikeInfo(String bm) throws Exception {

		PbsBikeInfo pbsBikeInfo = this.findPbsBikeInfoByBikebm(bm);
		if(pbsBikeInfo==null){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 212, null));
		}
		
		pbsBikeInfoMapper.deleteByPrimaryKey(pbsBikeInfo.getId());
	}

	@Override
	public void updatePbsBikeInfo(PbsBikeInfoCustom pbsBikeInfoCustom)
			throws Exception {
		PbsBikeInfo pbsBikeInfo = this.findPbsBikeInfoByBikebm(pbsBikeInfoCustom.getBm());	
		if(pbsBikeInfo==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 212, null));
		}
		//pbsBikeInfo.setId(pbsBikeInfoCustom.getId());
		pbsBikeInfo.setBm(pbsBikeInfoCustom.getBm());
		pbsBikeInfo.setCj(pbsBikeInfoCustom.getCj());
		pbsBikeInfo.setRq(pbsBikeInfoCustom.getRq());
		pbsBikeInfo.setZt(pbsBikeInfoCustom.getZt());
		pbsBikeInfo.setDt(pbsBikeInfoCustom.getDt());
		pbsBikeInfo.setZd(pbsBikeInfoCustom.getZd());
		pbsBikeInfo.setCz(pbsBikeInfoCustom.getCz());
		
//		BeanUtils.copyProperties(pbsBikeInfoCustom, pbsBikeInfo);
		
		pbsBikeInfoMapper.updateByPrimaryKey(pbsBikeInfo);
		
	}

}
