package pbs.base.dao.mapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.vo.PbsAppUserInfoCustom;

public class PbsAppUserInfoMapperCustomTest {
	private ApplicationContext applicationContext;
	private PbsAppUserInfoMapperCustom pbsAppUserInfoMapperCustom;

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
		pbsAppUserInfoMapperCustom = (PbsAppUserInfoMapperCustom) applicationContext.getBean("pbsAppUserInfoMapperCustom");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPbsAppUserInfo() throws Exception {
		PbsAppUserInfoCustom appUser = new PbsAppUserInfoCustom();
		appUser.setAccount("飞影");
		appUser.setPassword("123456");
		int a = pbsAppUserInfoMapperCustom.addPbsAppUser(appUser);
		System.out.println(a);
	}

}
