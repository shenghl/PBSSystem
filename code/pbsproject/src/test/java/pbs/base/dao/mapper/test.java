package pbs.base.dao.mapper;

import static org.junit.Assert.*;

import org.junit.Test;

import pbs.util.ResourcesUtil;

public class test {

	@Test
	public void test() {
		String a = ResourcesUtil.getValue("wechat", "appid");
		System.out.println(a);
	}
	
	@Test
	public void testTime(){
		String timestamp = Long.toString(System.currentTimeMillis()/1000);
		System.out.println(timestamp);
	}

}
