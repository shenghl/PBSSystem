package pbs.base.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.pojo.vo.ActiveUser;
import pbs.base.process.context.Config;
import pbs.base.process.result.ResultUtil;
import pbs.base.process.result.SubmitResultInfo;
import pbs.base.service.UserService;

@Controller
public class LoginAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(Model model)throws Exception{
		
		return "/base/login";
	}
	
	@RequestMapping("/loginsubmit")
	public @ResponseBody SubmitResultInfo loginsubmit(HttpSession session,String userid,String pwd,String validateCode)throws Exception{
		
		//校验验证码
		String validateCode_session = (String) session.getAttribute("validateCode");
		if(validateCode_session!=null && !validateCode_session.equals(validateCode)){
			ResultUtil.createFail(Config.MESSAGE, 113, null);
		}
		
		ActiveUser activeUser = userService.checkUserInfo(userid, pwd);
		
		session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 107, new Object[] { "" }));
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:login.action";
	}
}
