package com.ssm.zi.service.serviceImp;

import com.ssm.zi.dao.*;
import com.ssm.zi.model.*;
import com.ssm.zi.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.List;


@Service("userService")
public class DevServiceImp implements DevService {
    @Autowired
    private DevUserMapper devUserMapper;
    @Autowired
    private AppInfoMapper appInfoMapper;
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Autowired
    private AppCategoryMapper appCategoryMapper;
    @Autowired
    private AppVersionMapper appVersionMapper;

    @Override
    public DevUser devLogin(String devCode) {
        return devUserMapper.devLogin(devCode);
    }

    @Override
    public List<AppInfo> selectAll() {
        return appInfoMapper.selectAll();
    }

    /*查詢app所屬平臺*/
    @Override
    public DataDictionary selectType(Long id) {
        return dataDictionaryMapper.selectType(id);
    }

    /*查询app状态*/
    @Override
    public DataDictionary selectStatus(Long id) {
        return dataDictionaryMapper.selectStatus(id);
    }

    /*查询app类型*/
    @Override
    public String selectCate(Long id) {
        return appCategoryMapper.selectCate(id);
    }

    /*查询版本信息*/

    @Override
    public String selectVersion(Long id) {
        return appVersionMapper.selectVersion(id);
    }
    /*查询app所有状态*/
    @Override
    public List<DataDictionary> selectStatu() {
        return dataDictionaryMapper.selectStatu();
    }

    /*查询app所有平台*/
    @Override
    public List<DataDictionary> selectTypes() {
        return dataDictionaryMapper.selectTypes();
    }

    /*一级菜单*/
    @Override
    public List<AppCategory> no1() {
        return appCategoryMapper.no1();
    }

    /*二三级菜单*/
    @Override
    public List<AppCategory> nox(String pid) {
        if (pid==null||pid==""){
            return null;
        }else {
            long l = Long.parseLong(pid);
            return appCategoryMapper.nox(l);
        }
    }

    /*----------------------条件查询---------------------------*/
    @Override
    public List<AppInfo> selectList(AppInfo appInfo) {
        return appInfoMapper.selectList(appInfo);
    }

    /*--------------------------判断apk是否存在--------------------*/
    @Override
    public Long exists(String APKName) {
        return appInfoMapper.exists(APKName);
    }
    /*---------------------添加app基本信息-------------------------*/

    @Override
    public int insertSelective(AppInfo record) {
        return appInfoMapper.insertSelective(record);
    }

    /*---------------------------------------查询所有app版本------------------*/
    @Override
    public List<AppVersion> selectVersioned(Long appid) {
        return appVersionMapper.selectVersioned(appid);
    }

    /*----------------------用id查询app----------------------------------*/
    @Override
    public AppInfo selectByPrimaryKey(Long id) {
        return appInfoMapper.selectByPrimaryKey(id);
    }

    /*-------------------------------新增app版本-----------------------------*/
    @Override
    public int insertSelective(AppVersion record) {
        return appVersionMapper.insertSelective(record);
    }

    /*---------------------------------更新app表的最新版本-----------------------------------*/
    @Override
    public int updateByPrimaryKeySelective(AppInfo record) {
        return appInfoMapper.updateByPrimaryKeySelective(record);
    }

    /*----------------------------------------用版本id查询版本信息---------------------------------------*/
    @Override
    public AppVersion selectPrimaryKey(Long id) {
        return appVersionMapper.selectByPrimaryKey(id);
    }

    /*---------------------------------------------更新版本信息------------------------------------------*/
    @Override
    public int updateByPrimaryKeySelective(AppVersion record) {
        return appVersionMapper.updateByPrimaryKeySelective(record);
    }

    /*-------------------------------------------删除app--------------------------------------------------*/
    @Override
    public int deleteApp(Long id) {
        int a = appInfoMapper.deleteByPrimaryKey(id);
        int b = appVersionMapper.deleteAppVersionAll(id);
        int c = 0;
        if (a>0&&b>=0) {
            c = 1;
        }
        return c;
    }
}
