package com.ssm.zi.dao;

import com.ssm.zi.model.AppInfo;
import com.ssm.zi.model.AppInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppInfoMapper {
    long countByExample(AppInfoExample example);

    int deleteByExample(AppInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    List<AppInfo> selectByExample(AppInfoExample example);

    AppInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByExample(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);

    List<AppInfo> selectList(AppInfo appInfo);

    List<AppInfo> selectAll();

    Long exists(String APKName);

    int checkApp(Long id);
}