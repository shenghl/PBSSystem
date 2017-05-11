package pbs.base.filter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import pbs.base.pojo.vo.ActiveUser;
import pbs.base.process.context.Config;
import pbs.base.process.result.ResultUtil;
import pbs.util.ResourcesUtil;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		String url = request.getRequestURI();
		if(url.indexOf(Config.WECHAT)>=0){
			return true;
		}
		
		if(url.indexOf(Config.DISPACHER_APP)>=0){
			return true;
		}
		
		HttpSession session = request.getSession();
		ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		if(activeUser != null){
			return true;
		}
		
		List<String> open_urls = ResourcesUtil.gekeyList(Config.ANONYMOUS_ACTIONS);
		
		//System.out.println(url);
		for(String open_url:open_urls){
			if(url.indexOf(open_url)>=0){
				return true;
			}
		}
		
		//request.getRequestDispatcher("/WEB-INF/jsp/base/login.jsp").forward(request, response);
		ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 106, null));
		return false;
	}

}
