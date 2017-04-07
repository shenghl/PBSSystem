package pbs.base.service;

import java.util.List;

import pbs.base.pojo.vo.PbsNodeInfoCustom;
import pbs.base.pojo.vo.PbsNodeInfoQueryVo;

public interface NodeService {

	public List<PbsNodeInfoCustom> findPbsNodeInfoList (PbsNodeInfoQueryVo pbsNodeInfoQueryVo)throws Exception;
	
	public int findPbsNodeInfoCount(PbsNodeInfoQueryVo pbsNodeInfoQueryVo) throws Exception;
	
	//插入站点信息
	public void insertPbsNodeInfo(PbsNodeInfoCustom pbsNodeInfoCustom) throws Exception;
	
	//删除站点信息
	public void deletPbsNodeInfo(Integer id) throws Exception;
	
	//修改站点信息
	public void updatePbsNodeInfo(PbsNodeInfoCustom pbsNodeInfoCustom) throws Exception;
}
