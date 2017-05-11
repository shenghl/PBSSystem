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
import pbs.base.pojo.vo.PbsAppUserInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.process.context.Config;
import pbs.base.process.result.ResultInfo;
import pbs.base.process.result.ResultUtil;
import pbs.business.pojo.po.Locations;
import pbs.business.service.MapService;
import pbs.wechat.util.HttpUtils;

public class MapServiceImpl implements MapService{
	
	@Autowired
	private PbsRentInfoMapper pbsRentInfoMapper;
	
	@Autowired
	private PbsRentInfoMapperCustom pbsRentInfoMapperCustom;
	
	@Override
	//查询站点信息
	public List<PbsRentInfoCustom> findPbsRentInfoList(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception {
		return pbsRentInfoMapperCustom.findPbsRentInfoList(pbsRentInfoQueryVo);
	}

	@Override
	//查询站点数目
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

	
	
	
	//查询所有调度信息
	@Override
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo)
			throws Exception {
		
		return pbsRentInfoMapperCustom.findPbsDispacherInfoList(pbsDispacherInfoQueryVo);
	}

	//查询调度任务条目数
	@Override
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	//添加调度任务进入数据库
	@Override
	public int savePbsDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom) 
			throws Exception {
		//参数校验，非空校验
		if(pbsDispacherInfoCustom != null){
			//设置发布时间
			pbsDispacherInfoCustom.setTime(new Timestamp(System.currentTimeMillis()));
			
			
			//设置所发布任务的站点名称
			//获取站点ID
			int rentId = pbsDispacherInfoCustom.getRentId();
			//根据站点ID查询站点名
			PbsRentInfoExample pbsRentInfoExample = new PbsRentInfoExample();
			PbsRentInfoExample.Criteria criteria = pbsRentInfoExample.createCriteria();
			//设置查询条件
			criteria.andIdEqualTo(rentId);
			List<PbsRentInfo> list = pbsRentInfoMapper.selectByExample(pbsRentInfoExample);
			String rentName = list.get(0).getRentName();
			pbsDispacherInfoCustom.setRentName(rentName);
			
			return pbsRentInfoMapperCustom.savePbsDispacherInfo(pbsDispacherInfoCustom);
		}
		return 0;
	}

	
	//app用户注册
	@Override
	public int addPbsAppUserInfo(PbsAppUserInfoCustom pbsAppUserInfoCustom) throws Exception {
		String account = pbsAppUserInfoCustom.getAccount();
		PbsAppUserInfoCustom p = pbsRentInfoMapperCustom.findAppUserByAccount(account);
		
		if(p == null){
			return pbsRentInfoMapperCustom.addPbsAppUserInfo(pbsAppUserInfoCustom);
			
		}else{
			
			return 0;
		}
	}

	@Override
	//app用户登录验证
	public PbsAppUserInfoCustom findAppUserByAccount(String account,String password) throws Exception {
		
		PbsAppUserInfoCustom pbsAppUserInfoCustom = pbsRentInfoMapperCustom.findAppUserByAccount(account);
		if(pbsAppUserInfoCustom==null){
			//ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 101, null));
			throw new Exception("用户不存在！");
		}
		
		String check_password = pbsAppUserInfoCustom.getPassword();
		if(!check_password.equals(password)){
			throw new Exception("密码错误！");
		}
		return pbsAppUserInfoCustom;
	}

	@Override
	//调度任务完成
	public int updataDispacherInfo(PbsDispacherInfoCustom pbsDispacherInfoCustom) throws Exception {
		int rentId = pbsDispacherInfoCustom.getRentId();
		if(rentId >0){
			pbsDispacherInfoCustom.setFinishTime(new Timestamp(System.currentTimeMillis()));
			return pbsRentInfoMapperCustom.updateDispacher(pbsDispacherInfoCustom);
		}
		return 0;
	}

}
