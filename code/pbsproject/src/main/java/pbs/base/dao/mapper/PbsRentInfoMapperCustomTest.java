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
	
}
