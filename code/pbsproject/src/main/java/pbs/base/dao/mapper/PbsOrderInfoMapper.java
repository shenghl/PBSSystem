package pbs.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pbs.base.pojo.po.PbsOrderInfo;
import pbs.base.pojo.po.PbsOrderInfoExample;

public interface PbsOrderInfoMapper {
    int countByExample(PbsOrderInfoExample example);

    int deleteByExample(PbsOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PbsOrderInfo record);

    int insertSelective(PbsOrderInfo record);

    List<PbsOrderInfo> selectByExample(PbsOrderInfoExample example);

    PbsOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PbsOrderInfo record, @Param("example") PbsOrderInfoExample example);

    int updateByExample(@Param("record") PbsOrderInfo record, @Param("example") PbsOrderInfoExample example);

    int updateByPrimaryKeySelective(PbsOrderInfo record);

    int updateByPrimaryKey(PbsOrderInfo record);
}