package pbs.base.dao.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.po.PbsOrderInfo;
import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.wechat.util.HttpUtils;

public class Convert {

	private ApplicationContext applicationContext;
	@Test
	public void test() throws Exception {
		
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml", "spring/applicationContext-base-dao.xml"

		});
		PbsRentInfoQueryVo pbsRentInfoQueryVo = new PbsRentInfoQueryVo();
		PageQuery pageQuery = new PageQuery();
		pageQuery.setStart(0);
		pageQuery.setRows(2360);
		pbsRentInfoQueryVo.setPageQuery(pageQuery);
		
		PbsRentInfoMapperCustom pbsRentInfoMapperCustom = (PbsRentInfoMapperCustom) applicationContext
				.getBean("pbsRentInfoMapperCustom");
		PbsRentInfoMapper pbsRentInfoMapper = (PbsRentInfoMapper) applicationContext
				.getBean("pbsRentInfoMapper");
		List<PbsRentInfoCustom> list = pbsRentInfoMapperCustom.findPbsRentInfoList(pbsRentInfoQueryVo);
		Map<String,String> params = new HashMap<String,String>();
		for(PbsRentInfoCustom rent:list){
		//PbsRentInfoCustom rent = list.get(1);
//		System.out.println(rent);
			Double lat = rent.getLat();
			Double lng = rent.getLng();
			//System.out.println(lat+"---"+lng);
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
		    lng = Double.parseDouble(strArray[0]);
		    lat = Double.parseDouble(strArray[1]);
		    rent.setcLat(lat);
		    rent.setcLng(lng);
		    pbsRentInfoMapper.updateByPrimaryKeySelective(rent);
		    
		    }
	}
	
	@Test
	public void testOrder(){
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml", "spring/applicationContext-base-dao.xml"

		});
		
		PbsOrderInfoMapper pbsOrderInfoMapper = (PbsOrderInfoMapper) applicationContext
				.getBean("pbsOrderInfoMapper");
		PbsOrderInfo order = new PbsOrderInfo();
		order.setBikeBm("234");
		Long d = 1492780496000L;
		//order.setStartTime(new Date());
		//order.setStartTime(d);
		//pbsOrderInfoMapper.insert(order);
		PbsOrderInfo pbsOrderInfo = pbsOrderInfoMapper.selectByPrimaryKey(1);
		Date startTime = pbsOrderInfo.getStartTime();
		System.out.println(startTime);
		System.out.println(111);
	}

}
