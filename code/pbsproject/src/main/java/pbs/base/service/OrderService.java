package pbs.base.service;

import java.util.List;

import pbs.base.pojo.po.PbsOrderInfo;
import pbs.base.pojo.vo.PbsOrderInfoCustom;
import pbs.base.pojo.vo.PbsOrderInfoQueryVo;

public interface OrderService {

	public List<PbsOrderInfoCustom> findPbsOrderInfoList (PbsOrderInfoQueryVo pbsOrderInfoQueryVo)throws Exception;
	
	public int findPbsOrderInfoCount(PbsOrderInfoQueryVo pbsOrderInfoQueryVo) throws Exception;
	
	//根据openid查询
	public List<PbsOrderInfo> findPbsOrderInfoByOpenid(String openid)throws Exception;
	//插入订单信息
	public void insertPbsOrderInfo(PbsOrderInfoCustom pbsOrderInfoCustom) throws Exception;
	
	//删除订单信息
	public void deletPbsOrderInfo(Integer id) throws Exception;
	
	//修改订单信息
	public void updatePbsOrderInfo(PbsOrderInfoCustom pbsOrderInfoCustom) throws Exception;
}
