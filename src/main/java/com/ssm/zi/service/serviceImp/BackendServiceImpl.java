package com.ssm.zi.service.serviceImp;

import com.ssm.zi.dao.*;
import com.ssm.zi.model.AppCategory;
import com.ssm.zi.model.AppInfo;
import com.ssm.zi.model.BackendUser;
import com.ssm.zi.model.DataDictionary;
import com.ssm.zi.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackendServiceImpl implements BackendService {

    @Autowired
    private BackendUserMapper backendUserMapper;
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Autowired
    private AppInfoMapper appInfoMapper;
    @Autowired
    private AppCategoryMapper appCategoryMapper;
    @Autowired
    private AppVersionMapper appVersionMapper;

    @Override
    public BackendUser dologin(String usercode) {
        return backendUserMapper.loginIn(usercode);
    }

    @Override
    public String userTypeById(Long id) {
        return dataDictionaryMapper.userTypeById(id);
    }

    @Override
    public List<AppInfo> findAllAppInfo() {
        return appInfoMapper.selectAll();
    }

    @Override
    public DataDictionary selectType(Long id) {
        return dataDictionaryMapper.selectType(id);
    }

    @Override
    public DataDictionary selectStatus(Long id) {
        return dataDictionaryMapper.selectStatus(id);
    }

    @Override
    public String selectCate(Long id) {
        return appCategoryMapper.selectCate(id);
    }

    @Override
    public String selectVersion(Long id) {
        return appVersionMapper.selectVersion(id);
    }

    @Override
    public int checkApp_Pass(Long id) {
        return appInfoMapper.checkApp(id);
    }

    @Override
    public List<DataDictionary> selectTypes() {
        return dataDictionaryMapper.selectTypes();
    }

    @Override
    public List<AppCategory> selectLevel_1() {
        return appCategoryMapper.no1();
    }

    @Override
    public List<AppInfo> selectList(AppInfo appInfo) {
        return appInfoMapper.selectList(appInfo);
    }

    @Override
    public List<AppCategory> selectLevel2() {
        return appCategoryMapper.selectLevel2();
    }

    @Override
    public List<AppCategory> selectLevel3() {
        return appCategoryMapper.selectLevel3();
    }


    @Override
    public List<AppCategory> nox(String pid) {
        if (pid==null||pid==""){
            return null;
        }else {
            long l = Long.parseLong(pid);
            return appCategoryMapper.nox(l);
        }
    }
}

