package pbs.business.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.wechat.util.JSSDK_Config;
import pbs.wechat.util.Message;

@Controller
public class WechatConfigAction {
	
	@RequestMapping("/wechatconfig")
	public @ResponseBody Message JSSDK_config(@RequestParam(value = "url",required = true) String url){
		try {
			System.out.println(url);
			Map<String,String> configMap = JSSDK_Config.jsSDK_Sign(url);
			return Message.success(configMap);
		} catch (Exception e) {
			return Message.error();
		}
	}
}
