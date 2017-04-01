package pbs.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.service.BikeService;

@Controller
@RequestMapping("/bike")
public class BikeAction {
	
	@Autowired
	private BikeService bikeService;
	
	int start = 0;

	@RequestMapping("/querybike")
	public String queryBike(Model model)throws Exception{
		
		return "/base/bike/querybike";
	}
	
	@RequestMapping("/querybike_result")
	public @ResponseBody DataGridResultInfo queryBike_result(
			PbsBikeInfoQueryVo pbsBikeInfoQueryVo,
			int page,//页码
			int rows//每页显示个数
			)throws Exception{

		//非空校验
		pbsBikeInfoQueryVo = pbsBikeInfoQueryVo!=null?pbsBikeInfoQueryVo:new PbsBikeInfoQueryVo();
		int total = bikeService.findPbsBikeInfoCount(pbsBikeInfoQueryVo);
		
		PageQuery pageQuery = new PageQuery();
		pageQuery.handle(page,rows);
		pbsBikeInfoQueryVo.setPageQuery(pageQuery);
		List<PbsBikeInfoCustom> list = bikeService.findPbsBikeInfoList(pbsBikeInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
}
