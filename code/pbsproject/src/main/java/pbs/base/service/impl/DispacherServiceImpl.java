package pbs.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pbs.base.dao.mapper.PbsDispacherInfoMapperCustom;
import pbs.base.pojo.vo.PbsDispacherInfoCustom;
import pbs.base.pojo.vo.PbsDispacherInfoQueryVo;
import pbs.base.service.DispacherService;

public class DispacherServiceImpl implements DispacherService {

	//注入mapper
	@Autowired
	private PbsDispacherInfoMapperCustom pbsDispacherInfoMapperCustom;
	
	@Override
	public List<PbsDispacherInfoCustom> findPbsDispacherInfoList(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo)
			throws Exception {
		return pbsDispacherInfoMapperCustom.findPbsDispacherInfoList(pbsDispacherInfoQueryVo);
	}

	@Override
	public int findPbsDispacherInfoCount(PbsDispacherInfoQueryVo pbsDispacherInfoQueryVo) throws Exception {
		
		// TODO Auto-generated method stub
		return 0;
	}

}
