package pbs.business.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapAction {

	@RequestMapping("/querymap")
	public String showMap(){
		return "/business/map";
	}
}
