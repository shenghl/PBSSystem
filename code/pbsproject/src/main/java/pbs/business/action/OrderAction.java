package pbs.business.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pbs.base.dao.mapper.PbsNodeInfoMapper;
import pbs.base.pojo.po.PbsNodeInfo;
import pbs.base.pojo.vo.PageQuery;
import pbs.base.pojo.vo.PbsNodeInfoCustom;
import pbs.base.pojo.vo.PbsNodeInfoQueryVo;
import pbs.base.process.context.Config;
import pbs.base.process.result.DataGridResultInfo;
import pbs.base.process.result.ResultUtil;
import pbs.base.process.result.SubmitResultInfo;
import pbs.base.service.NodeService;

@Controller
@RequestMapping("/order")
public class OrderAction {

	@Autowired
	private NodeService orderService;
	
	@Autowired
	private PbsNodeInfoMapper pbsOrderInfoMapper;
	
	@RequestMapping("/queryorder")
	public String queryNode(Model model)throws Exception{
		return "/base/order/queryorder";
	}
	
	@RequestMapping("/queryorder_result")
	public @ResponseBody DataGridResultInfo queryNode_result(
			PbsNodeInfoQueryVo pbsNodeInfoQueryVo,
			int page,
			int rows
			) throws Exception{
		pbsNodeInfoQueryVo = pbsNodeInfoQueryVo!=null?pbsNodeInfoQueryVo:new PbsNodeInfoQueryVo();
		int total = orderService.findPbsNodeInfoCount(pbsNodeInfoQueryVo);
		PageQuery pageQuery = new PageQuery();
		pageQuery.handle(page, rows);
		pbsNodeInfoQueryVo.setPageQuery(pageQuery);
		List<PbsNodeInfoCustom> list = orderService.findPbsNodeInfoList(pbsNodeInfoQueryVo);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	//添加站点页面
	@RequestMapping("/addnode")
	public String addNode()throws Exception{
		return "/base/node/addnode";
	}
	
	//添加站点提交
	@RequestMapping("/addnodesubmit")
	public @ResponseBody SubmitResultInfo addNodeSumbit(PbsNodeInfoQueryVo pbsNodeInfoQueryVo)throws Exception{
		orderService.insertPbsNodeInfo(pbsNodeInfoQueryVo.getPbsNodeInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	//站点删除
	@RequestMapping("/deletenode")
	public @ResponseBody SubmitResultInfo deletePbsNodeInfo(Integer id) throws Exception{
		orderService.deletPbsNodeInfo(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/editnode")
	public String editPbsNodeInfo(Model model,Integer id)throws Exception{
		
		PbsNodeInfo pbsNodeInfo = pbsOrderInfoMapper.selectByPrimaryKey(id);
		model.addAttribute("pbsNodeInfo", pbsNodeInfo);
		
		return "/base/node/editnode";
	}
	
	@RequestMapping("/editnodesubmit")
	public @ResponseBody SubmitResultInfo editPbsNodeInfoSubmit(PbsNodeInfoQueryVo pbsNodeInfoQueryVo)throws Exception{
		orderService.updatePbsNodeInfo(pbsNodeInfoQueryVo.getPbsNodeInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
}
