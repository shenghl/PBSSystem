package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsOrderInfoMapper;
import pbs.base.dao.mapper.PbsOrderInfoMapperCustom;
import pbs.base.pojo.po.PbsOrderInfo;
import pbs.base.pojo.po.PbsOrderInfoExample;
import pbs.base.pojo.vo.PbsOrderInfoCustom;
import pbs.base.pojo.vo.PbsOrderInfoQueryVo;
import pbs.base.process.context.Config;
import pbs.base.process.result.ResultUtil;
import pbs.base.service.OrderService;

public class OrderServiceImpl implements OrderService{

	@Autowired
	private PbsOrderInfoMapperCustom pbsOrderInfoMapperCustom;
	
	@Autowired
	private PbsOrderInfoMapper pbsOrderInfoMapper;
	
	@Override
	public List<PbsOrderInfoCustom> findPbsOrderInfoList(
			PbsOrderInfoQueryVo pbsOrderInfoQueryVo) throws Exception {
		return pbsOrderInfoMapperCustom.findPbsOrderInfoList(pbsOrderInfoQueryVo);
	}

	@Override
	public int findPbsOrderInfoCount(PbsOrderInfoQueryVo pbsOrderInfoQueryVo)
			throws Exception {
		return pbsOrderInfoMapperCustom.findPbsOrderInfoCount(pbsOrderInfoQueryVo);
	}

	public List<PbsOrderInfo> findPbsOrderInfoByOpenid(String openid)throws Exception{
		PbsOrderInfoExample pbsOrderInfoExample = new PbsOrderInfoExample();
		PbsOrderInfoExample.Criteria criteria = pbsOrderInfoExample.createCriteria();
		//设置查询条件
		criteria.andOpenidEqualTo(openid);
		List<PbsOrderInfo> list = pbsOrderInfoMapper.selectByExample(pbsOrderInfoExample);
		return list;
	}
	
	@Override
	public void insertPbsOrderInfo(PbsOrderInfoCustom pbsOrderInfoCustom)
			throws Exception {

		PbsOrderInfo pbsOrderInfo = pbsOrderInfoMapper.selectByPrimaryKey(pbsOrderInfoCustom.getId());
		
		if(pbsOrderInfo!=null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 130, null));
		}
		
		pbsOrderInfoMapper.insert(pbsOrderInfoCustom);
		
	}
	
	public void deletPbsOrderInfo(Integer id) throws Exception{
		PbsOrderInfo pbsOrderInfo = pbsOrderInfoMapper.selectByPrimaryKey(id);
		if(pbsOrderInfo==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 131, null));
		}
		pbsOrderInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updatePbsOrderInfo(PbsOrderInfoCustom pbsOrderInfoCustom)
			throws Exception {

		PbsOrderInfo pbsOrderInfo = pbsOrderInfoMapper.selectByPrimaryKey(pbsOrderInfoCustom.getId());
		if(pbsOrderInfo==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 131, null));
		}
		
		BeanUtils.copyProperties(pbsOrderInfoCustom, pbsOrderInfo);
		
		pbsOrderInfoMapper.updateByPrimaryKey(pbsOrderInfo);
		
	}

}
