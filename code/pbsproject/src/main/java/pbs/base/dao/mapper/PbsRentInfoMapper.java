package pbs.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pbs.base.pojo.po.PbsRentInfo;
import pbs.base.pojo.po.PbsRentInfoExample;

public interface PbsRentInfoMapper {
    int countByExample(PbsRentInfoExample example);

    int deleteByExample(PbsRentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PbsRentInfo record);

    int insertSelective(PbsRentInfo record);

    List<PbsRentInfo> selectByExample(PbsRentInfoExample example);

    PbsRentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PbsRentInfo record, @Param("example") PbsRentInfoExample example);

    int updateByExample(@Param("record") PbsRentInfo record, @Param("example") PbsRentInfoExample example);

    int updateByPrimaryKeySelective(PbsRentInfo record);

    int updateByPrimaryKey(PbsRentInfo record);
}