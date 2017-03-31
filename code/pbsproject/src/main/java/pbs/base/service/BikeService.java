package pbs.base.service;

import java.util.List;

import pbs.base.pojo.vo.PbsBikeInfoCustom;
import pbs.base.pojo.vo.PbsBikeInfoQueryVo;

public interface BikeService {

	public List<PbsBikeInfoCustom> findPbsBikeInfoList(PbsBikeInfoQueryVo pbsBikeInfoQueryVo) throws Exception;
}
