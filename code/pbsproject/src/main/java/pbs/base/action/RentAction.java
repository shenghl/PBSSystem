package pbs.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.service.RentService;

@Controller
@RequestMapping("/rent")
public class RentAction {

	@Autowired
	private RentService rentService;
	
	@RequestMapping("/queryrent")
	public String queryRent(Model model)throws Exception{
		return "/base/rent/queryrent";
	}
	
	@RequestMapping("/queryrent_result")
	public @ResponseBody DataGridResultInfo queryRent_result(
			PbsRentInfoQueryVo pbsRentInfoQueryVo,
			int page,
			int rows
			) throws Exception{
		pbsRentInfoQueryVo = pbsRentInfoQueryVo!=null?pbsRentInfoQueryVo:new PbsRentInfoQueryVo();
		int total = rentService.findPbsRentInfoCount(pbsRentInfoQueryVo);
		PageQuery pageQuery = new PageQuery();
		pageQuery.handle(page, rows);
		pbsRentInfoQueryVo.setPageQuery(pageQuery);
		List<PbsRentInfoCustom> list = rentService.findPbsRentInfoList(pbsRentInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
}
