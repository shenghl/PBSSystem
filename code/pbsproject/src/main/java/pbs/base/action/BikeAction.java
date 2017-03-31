package pbs.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.service.BikeService;

@Controller
@RequestMapping("/bike")
public class BikeAction {
	
	@Autowired
	private BikeService bikeService;

	@RequestMapping("/querybike")
	public String queryBike(Model model)throws Exception{
		
		return "/base/bike/querybike";
	}
	
	@RequestMapping("/querybike_result")
	public @ResponseBody DataGridResultInfo queryBike_result(
			PbsBikeInfoQueryVo pbsBikeInfoQueryVo
			)throws Exception{
		System.out.println(pbsBikeInfoQueryVo);
		List<PbsBikeInfoCustom> rows = bikeService.findPbsBikeInfoList(pbsBikeInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		dataGridResultInfo.setTotal(rows.size());
		dataGridResultInfo.setRows(rows);
		return dataGridResultInfo;
	}
}
