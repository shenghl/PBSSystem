package pbs.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pbs.base.pojo.po.PbsBikeInfo;
import pbs.base.pojo.po.PbsBikeInfoExample;

public interface PbsBikeInfoMapper {
    int countByExample(PbsBikeInfoExample example);

    int deleteByExample(PbsBikeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PbsBikeInfo record);

    int insertSelective(PbsBikeInfo record);

    List<PbsBikeInfo> selectByExample(PbsBikeInfoExample example);

    PbsBikeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PbsBikeInfo record, @Param("example") PbsBikeInfoExample example);

    int updateByExample(@Param("record") PbsBikeInfo record, @Param("example") PbsBikeInfoExample example);

    int updateByPrimaryKeySelective(PbsBikeInfo record);

    int updateByPrimaryKey(PbsBikeInfo record);
}