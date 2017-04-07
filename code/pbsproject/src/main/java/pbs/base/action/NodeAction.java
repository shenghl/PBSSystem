package pbs.base.action;

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
@RequestMapping("/node")
public class NodeAction {

	@Autowired
	private NodeService nodeService;
	
	@Autowired
	private PbsNodeInfoMapper pbsNodeInfoMapper;
	
	@RequestMapping("/querynode")
	public String queryNode(Model model)throws Exception{
		return "/base/node/querynode";
	}
	
	@RequestMapping("/querynode_result")
	public @ResponseBody DataGridResultInfo queryNode_result(
			PbsNodeInfoQueryVo pbsNodeInfoQueryVo,
			int page,
			int rows
			) throws Exception{
		pbsNodeInfoQueryVo = pbsNodeInfoQueryVo!=null?pbsNodeInfoQueryVo:new PbsNodeInfoQueryVo();
		int total = nodeService.findPbsNodeInfoCount(pbsNodeInfoQueryVo);
		PageQuery pageQuery = new PageQuery();
		pageQuery.handle(page, rows);
		pbsNodeInfoQueryVo.setPageQuery(pageQuery);
		List<PbsNodeInfoCustom> list = nodeService.findPbsNodeInfoList(pbsNodeInfoQueryVo);
		
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
		nodeService.insertPbsNodeInfo(pbsNodeInfoQueryVo.getPbsNodeInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	//站点删除
	@RequestMapping("/deletenode")
	public @ResponseBody SubmitResultInfo deletePbsNodeInfo(Integer id) throws Exception{
		nodeService.deletPbsNodeInfo(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/editnode")
	public String editPbsNodeInfo(Model model,Integer id)throws Exception{
		
		PbsNodeInfo pbsNodeInfo = pbsNodeInfoMapper.selectByPrimaryKey(id);
		model.addAttribute("pbsNodeInfo", pbsNodeInfo);
		
		return "/base/node/editnode";
	}
	
	@RequestMapping("/editnodesubmit")
	public @ResponseBody SubmitResultInfo editPbsNodeInfoSubmit(PbsNodeInfoQueryVo pbsNodeInfoQueryVo)throws Exception{
		nodeService.updatePbsNodeInfo(pbsNodeInfoQueryVo.getPbsNodeInfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
}
