package com.ssm.zi.service;

import com.ssm.zi.model.AppCategory;
import com.ssm.zi.model.AppInfo;
import com.ssm.zi.model.BackendUser;
import com.ssm.zi.model.DataDictionary;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BackendService {
    BackendUser dologin(String usercode);

    String userTypeById(Long id);

    List<AppInfo> findAllAppInfo();

    DataDictionary selectType(Long id);

    DataDictionary selectStatus(Long id);

    String selectCate(Long id);

    String selectVersion(Long id);

    int checkApp_Pass(Long id);

    List<DataDictionary> selectTypes();

    List<AppCategory> selectLevel_1();

    List<AppInfo> selectList(AppInfo appInfo);

    List<AppCategory> selectLevel2();

    List<AppCategory> selectLevel3();

    List<AppCategory> nox(String pid);
}
