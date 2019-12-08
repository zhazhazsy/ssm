package com.ssm.zi.service;

import com.ssm.zi.model.*;

import java.util.List;

public interface DevService {
    DevUser devLogin(String devCode);
    List<AppInfo> selectAll();
    DataDictionary selectType(Long id);
    DataDictionary selectStatus(Long id);
    String selectCate(Long id);
    String selectVersion(Long id);
    List<DataDictionary> selectStatu();
    List<DataDictionary> selectTypes();
    List<AppCategory> no1();
    List<AppCategory> nox(String pid);
    List<AppInfo> selectList(AppInfo appInfo);
    Long exists(String APKName);
    int insertSelective(AppInfo record);
    List<AppVersion> selectVersioned(Long appid);
    AppInfo selectByPrimaryKey(Long id);
    int insertSelective(AppVersion record);
    int updateByPrimaryKeySelective(AppInfo record);
    AppVersion selectPrimaryKey(Long id);
    int updateByPrimaryKeySelective(AppVersion record);
    int deleteApp(Long id);
}
