package pbs.business.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsDispacherInfoMapperCustom;
import pbs.base.dao.mapper.PbsRentInfoMapper;
import pbs.base.dao.mapper.PbsRentInfoMapperCustom;
import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.po.PbsRentInfoExample;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.business.pojo.po.Locations;
import pbs.business.service.MapService;
import pbs.wechat.util.HttpUtils;

public class MapServiceImpl implements MapService{
	
	@Autowired
	private PbsRentInfoMapper pbsRentInfoMapper;
	
	@Autowired
	private PbsRentInfoMapperCustom pbsRentInfoMapperCustom;
	
	@Autowired
	private PbsDispacherInfoMapperCustom pbsDispacherInfoMapperCustom;
	
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
	public Locations convertLocations(String lat, String lng) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		String locations = lng + "," +lat;
		String coordsys = "gps";
		String key = "7e76bd669fb03c33ead0c58f894f51ee";
		String url = "http://restapi.amap.com/v3/assistant/coordinate/convert";
		params.put("locations", locations);
		params.put("coordsys", coordsys);
		params.put("key", key);
		String convertData = HttpUtils.sendGet(url, params);
		//System.out.println(convertData);
		String data = JSONObject.fromObject(convertData).getString("locations");
		//System.out.println(data);
		String[] strArray = null;   
	    strArray = data.split(",");
	    //System.out.println(strArray.toString());
	    lng = strArray[0];
	    lat = strArray[1];
	    Locations lo = new Locations();
	    lo.setcLat(Double.parseDouble(lat));
	    lo.setcLng(Double.parseDouble(lng));
		return lo;
	}

	
	
	
	//查询调度信息
	@Override
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo)
			throws Exception {
		return pbsRentInfoMapperCustom.findPbsDispacherInfoList(pbsDispacherInfoQueryVo);
	}

	@Override
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	//获取系统当前时间
	
	
	
	
	//插入调度信息进入数据库
	@Override
	public int savePbsDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom) 
			throws Exception {
		//参数校验，非空校验
		if(pbsDispacherInfoCustom != null){
			pbsDispacherInfoCustom.setTime(new Timestamp(System.currentTimeMillis()));
			return pbsRentInfoMapperCustom.savePbsDispacherInfo(pbsDispacherInfoCustom);
		}
		return 0;
	}

}
