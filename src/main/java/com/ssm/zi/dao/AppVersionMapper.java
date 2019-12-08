package com.ssm.zi.dao;

import com.ssm.zi.model.AppVersion;
import com.ssm.zi.model.AppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionMapper {
    List<AppVersion> selectVersioned(Long appid);

    String selectVersion(Long id);

    long countByExample(AppVersionExample example);

    int deleteByExample(AppVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppVersion record);

    int insertSelective(AppVersion record);

    List<AppVersion> selectByExample(AppVersionExample example);

    AppVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    int updateByPrimaryKeySelective(AppVersion record);

    int updateByPrimaryKey(AppVersion record);

    int deleteAppVersionAll(Long id);
}