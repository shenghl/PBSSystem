package pbs.base.pojo.po;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pbs.base.pojo.po.PbsNodeInfo;
import pbs.base.pojo.po.PbsNodeInfoExample;

public interface PbsNodeInfoMapper {
    int countByExample(PbsNodeInfoExample example);

    int deleteByExample(PbsNodeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PbsNodeInfo record);

    int insertSelective(PbsNodeInfo record);

    List<PbsNodeInfo> selectByExample(PbsNodeInfoExample example);

    PbsNodeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PbsNodeInfo record, @Param("example") PbsNodeInfoExample example);

    int updateByExample(@Param("record") PbsNodeInfo record, @Param("example") PbsNodeInfoExample example);

    int updateByPrimaryKeySelective(PbsNodeInfo record);

    int updateByPrimaryKey(PbsNodeInfo record);
}