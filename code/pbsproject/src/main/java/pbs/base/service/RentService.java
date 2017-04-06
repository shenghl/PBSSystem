package pbs.base.service;

import java.util.List;

import pbs.base.pojo.vo.PbsRentInfoCustom;
import pbs.base.pojo.vo.PbsRentInfoQueryVo;

public interface RentService {

	public List<PbsRentInfoCustom> findPbsRentInfoList (PbsRentInfoQueryVo pbsRentInfoQueryVo)throws Exception;
	
	public int findPbsRentInfoCount(PbsRentInfoQueryVo pbsRentInfoQueryVo) throws Exception;
}
