package pbs.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pbs.base.pojo.po.PbsUserInfo;
import pbs.base.pojo.po.PbsUserInfoExample;

public interface PbsUserInfoMapper {
    int countByExample(PbsUserInfoExample example);

    int deleteByExample(PbsUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PbsUserInfo record);

    int insertSelective(PbsUserInfo record);

    List<PbsUserInfo> selectByExample(PbsUserInfoExample example);

    PbsUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PbsUserInfo record, @Param("example") PbsUserInfoExample example);

    int updateByExample(@Param("record") PbsUserInfo record, @Param("example") PbsUserInfoExample example);

    int updateByPrimaryKeySelective(PbsUserInfo record);

    int updateByPrimaryKey(PbsUserInfo record);
}