package pbs.base.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstAction {

	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		return "/base/first";
	}
	@RequestMapping("/welcome")
	public String welcome(){
		return "/base/welcome";
	}
}
