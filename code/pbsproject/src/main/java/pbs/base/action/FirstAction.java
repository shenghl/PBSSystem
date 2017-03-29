package pbs.base.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.service.BikeInfoService;

@Controller
public class FirstAction {

	@Autowired
	private BikeInfoService pbsBikeInfoService;
	
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		PbsBikeInfo pbsBikeInfo = pbsBikeInfoService.findBikeInfoById(2);
		model.addAttribute("pbsBikeInfo", pbsBikeInfo);
		return "/base/first";
	}
	@RequestMapping("/welcome")
	public String welcome(){
		return "/base/welcome";
	}
}
