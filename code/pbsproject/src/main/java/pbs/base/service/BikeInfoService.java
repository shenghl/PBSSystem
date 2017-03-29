package pbs.base.service;

import pbs.base.pojo.po.PbsBikeInfo;

public interface BikeInfoService {

	//根据自行车的编号查询自行车的信息
	public PbsBikeInfo findBikeInfoById(int id) throws Exception;
}
