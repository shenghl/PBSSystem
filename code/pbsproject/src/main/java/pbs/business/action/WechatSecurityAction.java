package pbs.business.action;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pbs.wechat.dispatcher.EventDispatcher;
import pbs.wechat.dispatcher.MsgDispatcher;
import pbs.wechat.util.MessageUtil;
import pbs.wechat.util.WechatSignUtil;

@Controller
@RequestMapping("/wechat")
public class WechatSecurityAction {
	
	private static Logger logger = Logger.getLogger(WechatSignUtil.class);

	@RequestMapping(value="/security",method= RequestMethod.GET)
	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value="signature",required=true) String signature,
			@RequestParam(value="timestamp",required=true) String timestamp,
			@RequestParam(value="nonce",required=true) String nonce,
			@RequestParam(value="echostr",required=true) String echostr){
		try {
			if(WechatSignUtil.checkSignature(signature, timestamp, nonce)){
				PrintWriter out = response.getWriter();
				out.print(echostr);
				out.close();
			}else{
				logger.info("这里存在非法请求！");
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	@RequestMapping(value="security",method=RequestMethod.POST)
	public void DoPost(HttpServletRequest request,HttpServletResponse response){
		String respMessage = null;
		PrintWriter out = null; 
		try{
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
            Map<String, String> map=MessageUtil.parseXml(request);
            String msgtype=map.get("MsgType");
            if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
            	respMessage = EventDispatcher.processEvent(map); //进入事件处理
            }else{
            	respMessage = MsgDispatcher.processMessage(map); //进入消息处理
            }
            out = response.getWriter();
            out.print(respMessage);
        }catch(Exception e){
            logger.error(e,e);
        }
	}
}
