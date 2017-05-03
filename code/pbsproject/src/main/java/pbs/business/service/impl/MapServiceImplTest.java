package pbs.business.service.impl;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.business.service.MapService;

public class MapServiceImplTest {
	private ApplicationContext applicationContext;
	private MapService mapService;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(new String[]{
				"spring/applicationContext-base-dao.xml",
				"spring/applicationContext-base-service.xml",
				"spring/applicationContext-business-service.xml",
				"spring/applicationContext.xml"
		});
		mapService = (MapService) applicationContext.getBean("mapService");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindPbsRentInfoList() throws Exception {
		List<PbsRentInfoCustom> l = mapService.findPbsRentInfoList(new PbsRentInfoQueryVo());
		for(PbsRentInfoCustom e : l){
			System.out.println(e.getRentName());
		}
	}

	@Test
	public void testFindPbsDispacherInfoList() throws Exception {
		List<PbsDispacherInfoCustom> l = mapService.findPbsDispacherInfoList(new PbsDispacherInfoQueryVo());
		for(PbsDispacherInfoCustom e : l){
			System.out.println(e.getRentId());
		}
	}

	@Test
	public void testFindPbsDispacherInfoCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSavePbsDispacherInfo() throws Exception{
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setRentId(2088);
		pbsDispacherInfoCustom.setZt("调入");
		pbsDispacherInfoCustom.setNum(8);
		pbsDispacherInfoCustom.setTime(null);
		int a = mapService.savePbsDispacherInfo(pbsDispacherInfoCustom);
		System.out.println(a);
		
	}
}
