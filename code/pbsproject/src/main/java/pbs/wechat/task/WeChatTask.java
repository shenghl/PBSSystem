package pbs.wechat.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;
import pbs.base.process.context.Config;
import pbs.util.ResourcesUtil;
import pbs.wechat.util.HttpUtils;

/**
 * ClassName: WeChatTask
 * @Description: 微信两小时定时任务体
 * @author dapengniao
 * @date 2016 年 3 月 10 日 下午 1:42:29
 */
public class WeChatTask {
    /**
     * @Description: 任务执行体
     * @param @throws Exception
     * @author dapengniao
     * @date 2016 年 3 月 10 日 下午 2:04:37
     */
    public  static void getToken_getTicket() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credential");
        params.put("appid", ResourcesUtil.getValue("wechat", "appid"));
        params.put("secret", ResourcesUtil.getValue("wechat", "AppSecret"));
        String jstoken = HttpUtils.sendGet(
        		ResourcesUtil.getValue("interface_url", "tokenUrl"), params);
        String access_token = JSONObject.fromObject(jstoken).getString(
                "access_token"); // 获取到 token 并赋值保存
        Config.properties.setProperty("access_token", access_token);
        //GlobalConstants.interfaceUrlProperties.put("access_token", access_token);
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"token 为=============================="+access_token);
                
//获取jsticket的执行体
//        params.clear();
//        params.put("access_token", access_token);
//        params.put("type", "jsapi");
//        String jsticket = HttpUtils.sendGet(
//                GlobalConstants.getInterfaceUrl("ticketUrl"), params);
//        String jsapi_ticket = JSONObject.fromObject(jsticket).getString(
//                "ticket"); 
//        GlobalConstants.interfaceUrlProperties
//        .put("jsapi_ticket", jsapi_ticket); // 获取到js-SDK的ticket并赋值保存
//         
//        System.out.println("jsapi_ticket================================================" + jsapi_ticket);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"刘炎的token为=============================="+access_token);
    }

}