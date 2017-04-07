package pbs.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.dao.mapper.PbsRentInfoMapper;
import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;
import pbs.base.process.context.Config;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.process.result.ResultUtil;
import pbs.base.process.result.SubmitResultInfo;
import pbs.base.service.RentService;

@Controller
@RequestMapping("/rent")
public class RentAction {

	@Autowired
	private RentService rentService;
	
	@Autowired
	private PbsRentInfoMapper pbsRentInfoMapper;
	
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
	
	//添加站点页面
	@RequestMapping("/addrent")
	public String addRent()throws Exception{
		return "/base/rent/addrent";
	}
	
	//添加站点提交
	@RequestMapping("/addrentsubmit")
	public @ResponseBody SubmitResultInfo addRentSumbit(PbsRentInfoQueryVo pbsRentInfoQueryVo)throws Exception{
		rentService.insertPbsRentInfo(pbsRentInfoQueryVo.getPbsRentInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	//站点删除
	@RequestMapping("/deleterent")
	public @ResponseBody SubmitResultInfo deletePbsRentInfo(Integer id) throws Exception{
		rentService.deletPbsRentInfo(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/editrent")
	public String editPbsRentInfo(Model model,Integer id)throws Exception{
		
		PbsRentInfo pbsRentInfo = pbsRentInfoMapper.selectByPrimaryKey(id);
		model.addAttribute("pbsRentInfo", pbsRentInfo);
		
		return "/base/rent/editrent";
	}
	
	@RequestMapping("/editrentsubmit")
	public @ResponseBody SubmitResultInfo editPbsRentInfoSubmit(PbsRentInfoQueryVo pbsRentInfoQueryVo)throws Exception{
		rentService.updatePbsRentInfo(pbsRentInfoQueryVo.getPbsRentInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
}
