package pbs.base.dao.mapper;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.vo.PbsAppCarInfoCustom;
import pbs.base.pojo.vo.PbsAppUserInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;

public class PbsRentInfoMapperCustomTest {

	private ApplicationContext applicationContext;
	
	private PbsRentInfoMapper pbsRentInfoMapper;
	
	private PbsRentInfoMapperCustom pbsRentInfoMapperCustom;
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//获取容器
		applicationContext = new ClassPathXmlApplicationContext(new String[]{
				"spring/applicationContext.xml","spring/applicationContext-base-dao.xml"
		});
		pbsRentInfoMapperCustom = (PbsRentInfoMapperCustom) applicationContext.getBean("pbsRentInfoMapperCustom");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindPbsRentInfoList() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindPbsRentInfoCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindPbsDispacherInfoList() throws Exception {
		List<PbsDispacherInfoCustom> l = pbsRentInfoMapperCustom.findPbsDispacherInfoList(new PbsDispacherInfoQueryVo());
		for(PbsDispacherInfoCustom e : l){
			System.out.println(e.getRentId()+","+e.getZt()+","+e.getNum()+","+e.getTime());
		}
	}

	@Test
	public void testFindPbsDispacherInfoCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSavePbsDispacherInfo() throws Exception{
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setRentId(2040);
		pbsDispacherInfoCustom.setZt("调入");
		pbsDispacherInfoCustom.setNum(40);
		pbsDispacherInfoCustom.setTime(null);
		int a = pbsRentInfoMapperCustom.savePbsDispacherInfo(pbsDispacherInfoCustom);
		System.out.println(a);
	}
	
	@Test
	public void testAddAppUserInfo() throws Exception {
		PbsAppUserInfoCustom pbsAppUserInfoCustom = new PbsAppUserInfoCustom();
		pbsAppUserInfoCustom.setAccount("飞享");
		pbsAppUserInfoCustom.setPassword("123123");
		int a = pbsRentInfoMapperCustom.addPbsAppUserInfo(pbsAppUserInfoCustom);
		System.out.println(a);
	}

	
	@Test
	//app用户登录验证
	public void testFindAppUserInfo() throws Exception {
		PbsAppUserInfoCustom p = pbsRentInfoMapperCustom.findAppUserByAccount("adf");
		System.out.println(p.getAccount()+":"+p.getPassword());
	}
	
	@Test
	//调度任务完成验证
	public void testUpdateDispacherInfo() throws Exception {
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setOperator("22");
		pbsDispacherInfoCustom.setRentId(1310);
		int a = pbsRentInfoMapperCustom.updateDispacher(pbsDispacherInfoCustom);
		System.out.println(a);
	}

	@Test
	//app用户修改密码
	public void testUpdateAppUserPWDInfo() throws Exception {
		PbsAppUserInfoCustom pbsAppUserInfoCustom = new PbsAppUserInfoCustom();
		pbsAppUserInfoCustom.setAccount("44");
		pbsAppUserInfoCustom.setPassword("123456");
		int a  = pbsRentInfoMapperCustom.updateAppUserChangePWD(pbsAppUserInfoCustom);
		System.out.println(a);
	}
	
	@Test
	//车辆信息插入
	public void testAddAppCarInfo() throws Exception {
		PbsAppCarInfoCustom pbsAppCarInfoCustom = new PbsAppCarInfoCustom();
		pbsAppCarInfoCustom.setCarType("陕汽");
		pbsAppCarInfoCustom.setPlateNumber("浙A99999");
		pbsAppCarInfoCustom.setArea(null);
		pbsAppCarInfoCustom.setOperator("000000");
		int a = pbsRentInfoMapperCustom.addPbsAppCarInfo(pbsAppCarInfoCustom);
		
		System.out.println(a);
	}
	
	@Test
	//车辆信息查询
	public void testFindCarInfo() throws Exception {
		List<PbsAppCarInfoCustom> pbsAppCarInfoCustom = pbsRentInfoMapperCustom.findAppCarByAccount("99");
		for(PbsAppCarInfoCustom e : pbsAppCarInfoCustom){
			System.out.println(e.getOperator()+","+e.getPlateNumber());
			
		}
	}
	
}
