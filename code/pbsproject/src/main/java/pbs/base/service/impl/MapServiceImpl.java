package pbs.base.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsRentInfoMapper;
import pbs.base.dao.mapper.PbsRentInfoMapperCustom;
import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.po.PbsRentInfoExample;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.service.MapService;
import pbs.wechat.util.HttpUtils;

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

	@Override
	public List<PbsRentInfoCustom> findConvertRentList(
			PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception {
		List<PbsRentInfoCustom> list = pbsRentInfoMapperCustom.findPbsRentInfoList(pbsRentInfoQueryVo);
		Map<String,String> params = new HashMap<String,String>();
		//for(PbsRentInfoCustom rent:list){
		PbsRentInfoCustom rent = list.get(0);
			Double lat = rent.getLat();
			Double lng = rent.getLng();
			String locations = lng + "," +lat;
			String coordsys = "gps";
			String key = "7e76bd669fb03c33ead0c58f894f51ee";
			String url = "http://restapi.amap.com/v3/assistant/coordinate/convert";
			params.put("locations", locations);
			params.put("coordsys", coordsys);
			params.put("key", key);
			String convertData = HttpUtils.sendGet(url, params);
			//String data = JSONObject.fromObject(convertData).getString("data");
			System.out.println(convertData);
		//}
		return null;
	}
}
