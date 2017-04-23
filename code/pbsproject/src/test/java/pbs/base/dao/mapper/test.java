package pbs.base.dao.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import pbs.util.ResourcesUtil;

public class test {

	@Test
	public void test() {
		String a = ResourcesUtil.getValue("wechat", "appid");
		System.out.println(a);
	}
	
	@Test
	public void testTime() throws InterruptedException, ParseException{
//		String timestamp = Long.toString(System.currentTimeMillis());
//		System.out.println(timestamp);
		Date date1 = new Date();
		System.out.println(date1);
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat format =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String d = format.format(System.currentTimeMillis());
		System.out.println(d);
		Date date = format.parse(d);
		System.out.println(date);
	}

}
