package pbs.base.dao.mapper;

import junit.framework.TestCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pbs.base.pojo.po.PbsBikeInfo;

public class PbsBikeInfoMapperTest extends TestCase {
	
	@Autowired
	private PbsBikeInfoMapper pbsBikeInfoMapper;
	
	
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	public void testInsert() {
		fail("Not yet implemented");
	}

	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	//根据主键查询
	public void testSelectByPrimaryKey() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"spring/applicationContext.xml", "spring/applicationContext-base-dao.xml"

		});
		pbsBikeInfoMapper = (PbsBikeInfoMapper) applicationContext.getBean("pbsBikeInfoMapper");
		PbsBikeInfo bike = pbsBikeInfoMapper.selectByPrimaryKey((long) 1);
		System.out.println(bike);
	}

	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
