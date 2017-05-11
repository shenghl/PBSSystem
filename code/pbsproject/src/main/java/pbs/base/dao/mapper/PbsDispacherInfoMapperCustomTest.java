package pbs.base.dao.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;

public class PbsDispacherInfoMapperCustomTest {
	private ApplicationContext applicationContext;
	private PbsDispacherInfoMapperCustom pbsDispacherInfoMapperCustom;

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
		pbsDispacherInfoMapperCustom = (PbsDispacherInfoMapperCustom) applicationContext.getBean("pbsDispacherInfoMapperCustom");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindPbsDispacherInfoList() throws Exception {
		List<PbsDispacherInfoCustom> l = pbsDispacherInfoMapperCustom.findPbsDispacherInfoList(new PbsDispacherInfoQueryVo());
		for(PbsDispacherInfoCustom e : l){
			System.out.println(e.getRentId()+";"+e.getRentId());
		}
	}

	@Test
	public void testFindPbsDispacherInfoCount() throws Exception {
		int a = pbsDispacherInfoMapperCustom.findPbsDispacherInfoCount(new PbsDispacherInfoQueryVo());
		System.out.println(a);
	}

	@Test
	public void testSavePbsDispacherInfo() throws Exception {
		PbsDispacherInfoCustom pbsDispacherInfoCustom = new PbsDispacherInfoCustom();
		pbsDispacherInfoCustom.setRentId(2017);
		pbsDispacherInfoCustom.setZt("调出");
		pbsDispacherInfoCustom.setNum(17);
		
		int a = pbsDispacherInfoMapperCustom.savePbsDispacherInfo(pbsDispacherInfoCustom);
		System.out.println(a);
	}

}
