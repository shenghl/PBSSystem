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

import pbs.base.pojo.vo.PbsAppUserInfoCustom;
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
			System.out.println(e.getRentId()+":"+e.getOperator());
		}
	}

	@Test
	public void testFindPbsDispacherInfoCount() {
		fail("Not yet implemented");
	}

	@Test
	//调度任务插入
	public void testSavePbsDispacherInfo() throws Exception{
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setRentId(2088);
		pbsDispacherInfoCustom.setZt("调入");
		pbsDispacherInfoCustom.setNum(8);
		pbsDispacherInfoCustom.setTime(null);
		int a = mapService.savePbsDispacherInfo(pbsDispacherInfoCustom);
		System.out.println(a);
		
	}
	
	@Test
	//app用户注册
	public void testAddAppUser() throws Exception {
		PbsAppUserInfoCustom pbsAppUserInfoCustom = new PbsAppUserInfoCustom();
		pbsAppUserInfoCustom.setAccount("Seervice Test");
		pbsAppUserInfoCustom.setPassword("121212");
		int a = mapService.addPbsAppUserInfo(pbsAppUserInfoCustom);
		System.out.println(a);
	}
	
	@Test
	//app用户登录验证
	public void testFindAppUser() throws Exception {
		PbsAppUserInfoCustom pbsAppUserInfoCustom = mapService.findAppUserByAccount("adf", "adsf");
		System.out.println(pbsAppUserInfoCustom.getAccount()+":"+pbsAppUserInfoCustom.getPassword());
	}
	
	@Test
	//调度任务完成
	public void testUpdateDispacherInfo() throws Exception {
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setOperator("444");
		pbsDispacherInfoCustom.setRentId(1270);
		int a = mapService.updataDispacherInfo(pbsDispacherInfoCustom);
		System.out.println(a);
	}
	
	@Test
	//app用户密码修改
	public void testUpdateAppUserPWD() throws Exception {
		int a = mapService.updateAppUserChangePWD("444", "444","123456" );
		System.out.println(a);
	}
	
}
