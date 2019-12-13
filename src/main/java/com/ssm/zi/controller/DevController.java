package com.ssm.zi.controller;

import com.alibaba.fastjson.JSONArray;
import com.mysql.jdbc.StringUtils;
import com.ssm.zi.model.*;
import com.ssm.zi.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/dev")
public class DevController {
    @Autowired
    private DevService devService;

    @RequestMapping("/login")
    public String test(){
        return "devlogin";
    }
    /* -------------------------------------------------APP开发者登录---------------------------------------------*/
    @RequestMapping("/dologin")
    public String dologin(
            @RequestParam("devCode") String devCode,
            @RequestParam("devPassword") String devPassword,
            HttpServletRequest request, HttpSession session,
            Model model
    ){
        DevUser devUser = devService.devLogin(devCode);
        if (devUser!=null&&devUser.getDevpassword().equals(devPassword)) {
            session.setAttribute("devUserSession",devUser);
            session.setAttribute("devid",devUser.getId());
            return "/developer/main";
        }
        return "devlogin";
    }

    /*-------------------------------------------------------注销----------------------------------------------*/
    @RequestMapping("logout")
    public String logout(HttpServletRequest request, HttpSession session){
        session.removeAttribute("devUserSession");
        return "devlogin";
    }

    /*--------------------------------------------------查询所有app信息-----------------------------------------*/
    @RequestMapping("/flatform/app/list")//被appinfoaddsave调用了
    public String selectList(Model model){
        List<AppInfo> list1 = devService.selectAll();
        List<DataDictionary> statusList = devService.selectStatu();
        List<DataDictionary> flatFormList = devService.selectTypes();
        List<AppCategory> categoryLevel1List = devService.no1();
        model.addAttribute("appInfoList",demo(list1));
        model.addAttribute("statusList",statusList);
        model.addAttribute("flatFormList",flatFormList);
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        return "developer/appinfolist";
    }
    /*-------------------------------------------------------------关联表****---------------------------------*/
    public List<AppInfo> demo(List<AppInfo> list){
        List<AppInfo> list2 = new ArrayList<>();
        for (AppInfo l:list){
            l.setFlatformname(devService.selectType(l.getFlatformid()).getValuename());
            l.setStatu(devService.selectStatus(l.getStatus()).getValuename());
            l.setCategorylevelname1(devService.selectCate(l.getCategorylevel1()));
            l.setCategorylevelname2(devService.selectCate(l.getCategorylevel2()));
            l.setCategorylevelname3(devService.selectCate(l.getCategorylevel3()));
            l.setVersionname(devService.selectVersion(l.getVersionid()));
            list2.add(l);
        }
        return list2;
    }
    /*----------------------------------------------------------------二级菜单*-----------------------------------*/
    @RequestMapping(
            value = {"/categorylevellist.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<AppCategory> getAppCategoryList(@RequestParam String pid) {
        if (pid.equals("")) {
            pid = null;
        }
        return devService.nox(pid);
    }
    /*------------------------------------------------------------------条件查询---------------------------------*/
    @RequestMapping("/list")
    public String list(Model model,
                       @RequestParam(value = "querySoftwareName",required = false) String querySoftwareName,
                       @RequestParam(value = "queryStatus",required = false) Long queryStatus,
                       @RequestParam(value = "queryFlatformId",required = false) Long queryFlatformId,
                       @RequestParam(value = "queryCategoryLevel1",required = false) Long queryCategoryLevel1,
                       @RequestParam(value = "queryCategoryLevel2",required = false) Long queryCategoryLevel2,
                       @RequestParam(value = "queryCategoryLevel3",required = false) Long queryCategoryLevel3
                       ){
        AppInfo appInfo = new AppInfo();
        if (querySoftwareName!=null) {
            appInfo.setSoftwarename(querySoftwareName);
        }
        if (queryStatus!=null) {
            appInfo.setStatus(queryStatus);
        }
        if (queryFlatformId!=null) {
            appInfo.setFlatformid(queryFlatformId);
        }
        if (queryCategoryLevel1!=null) {
            appInfo.setCategorylevel1(queryCategoryLevel1);
        }
        if (queryCategoryLevel2!=null) {
            appInfo.setCategorylevel2(queryCategoryLevel2);
        }
        if (queryCategoryLevel3!=null) {
            appInfo.setCategorylevel3(queryCategoryLevel3);
        }
        List<AppInfo> list1 = devService.selectList(appInfo);
        List<DataDictionary> statusList = devService.selectStatu();
        List<DataDictionary> flatFormList = devService.selectTypes();
        List<AppCategory> categoryLevel1List = devService.no1();
        model.addAttribute("appInfoList",demo(list1));
        model.addAttribute("statusList",statusList);
        model.addAttribute("flatFormList",flatFormList);
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        return "developer/appinfolist";
    }

    /*----------------------------------------------------------------新增app------------------------------*/
    @RequestMapping("/flatform/app/appinfoadd")
    public String appinfoadd(){
        return "developer/appinfoadd";
    }
    /*-----------------------------------------------------------平台列表-------------------------*/
    @RequestMapping(
            value = {"/tadictionarylist.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<DataDictionary> flatform(){
        return devService.selectTypes();
    }
    /*--------------------------------------------------------------------一级列表--------------------------------*/
    @RequestMapping(
            value = {"/categorylevellist0.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<AppCategory> cate(){
        return devService.no1();
    }

    /*---------------------------------------------------------------判断apk名字是否存在---------------------------*/
    @RequestMapping(
            value = {"/apkexist.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public Object apkNameIsExit(@RequestParam String APKName) {
        HashMap<String, String> resultMap = new HashMap();
        if (StringUtils.isNullOrEmpty(APKName)) {
            resultMap.put("APKName", "empty");
        } else {
            Long exist = devService.exists(APKName);

            if (exist != null) {
                resultMap.put("APKName", "exist");
            } else {
                resultMap.put("APKName", "noexist");
            }
        }
        return JSONArray.toJSONString(resultMap);
    }
    /*-----------------------------------------------------------------添加app-------------------------------*/
    @RequestMapping(
            value = {"/appinfoaddsave"},
            method = {RequestMethod.POST}
    )
    public String appinfoaddsave(
            @RequestParam(value = "softwareName",required = false) String softwareName,
            @RequestParam(value = "APKName",required = false) String APKName,
            @RequestParam(value = "supportROM",required = false) String supportROM,
            @RequestParam(value = "interfaceLanguage",required = false) String interfaceLanguage,
            @RequestParam(value = "softwareSize",required = false) BigDecimal softwareSize,
            @RequestParam(value = "flatformId",required = false) Long flatformId,
            @RequestParam(value = "downloads",required = false) Long downloads,
            @RequestParam(value = "categoryLevel1",required = false) Long categoryLevel1,
            @RequestParam(value = "categoryLevel2",required = false) Long categoryLevel2,
            @RequestParam(value = "categoryLevel3",required = false) Long categoryLevel3,
            @RequestParam(value = "status",required = false) Long status,
            @RequestParam(value = "appInfo",required = false) String appInfo,
            @RequestParam(value = "logo",required = false) MultipartFile logo,
            Model model,
            HttpSession session,
            HttpServletRequest request

    ) throws IOException {
        //保存数据库的路径
        String sqlPath = null;
        //定义文件保存的本地路径
        String localPath="D:\\IntelliJ IDEA 2019.2.1\\MyssmTest\\src\\main\\webapp\\statics\\logo\\";
        //定义 文件名
        String filename =null;
        if(!logo.isEmpty()){
            //生成uuid作为文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            String type = logo.getContentType().split("/")[0];
            String suffixName = logo.getContentType().split("/")[1];
            filename = uuid+"."+suffixName;
            if (!type.equals("image")){
                return appinfoadd();
            }
            logo.transferTo(new File(localPath+filename));
            System.out.println(localPath+filename);
        }




        AppInfo appInfo1 = new AppInfo();
        appInfo1.setLogolocpath(localPath+filename);
        appInfo1.setLogopicpath("/statics/logo/"+filename);
        appInfo1.setSoftwarename(softwareName);
        appInfo1.setApkname(APKName);
        appInfo1.setSupportrom(supportROM);
        appInfo1.setInterfacelanguage(interfaceLanguage);
        appInfo1.setSoftwaresize(softwareSize);
        appInfo1.setDownloads(downloads);
        appInfo1.setCategorylevel1(categoryLevel1);
        appInfo1.setCategorylevel2(categoryLevel2);
        appInfo1.setCategorylevel3(categoryLevel3);
        appInfo1.setStatus(status);
        appInfo1.setAppinfo(appInfo);
        appInfo1.setFlatformid(flatformId);
        appInfo1.setDevid((Long) session.getAttribute("devid"));
        appInfo1.setCreationdate(new Date());
        int t = devService.insertSelective(appInfo1);
        if (t>0){
            return selectList(model);
        }
        else {
            return "developer/appinfoadd";
        }
        /*String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploadfiles");
        return null;*/
    }

    /*------------------------------------------------app版本---------------------------------------*/
    @RequestMapping(
            value = {"/appversionadd"},
            method = {RequestMethod.GET}
    )//被下面调用了  改的话下面也要改
    public String addVersion(@RequestParam("id") Long appId, Model model) {
        model.addAttribute("appid",appId);
        AppInfo appInfo = devService.selectByPrimaryKey(appId);
        String name = appInfo.getSoftwarename();
        List<AppVersion> list = devService.selectVersioned(appId);
        List<AppVersion> list2 = new ArrayList<>();
        for (AppVersion l:list){
            l.setAppname(name);
            l.setPublishStatusname(devService.selectStatus(l.getPublishstatus()).getValuename());
            list2.add(l);
        }
        model.addAttribute("appVersionList",list2);
        return "developer/appversionadd";
    }

    /*----------------------------------------------添加app版本--------------------------*/
    @RequestMapping(
            value = {"/addversionsave"},
            method = {RequestMethod.POST}
    )
    public String addversionsave(
            @RequestParam("appId") Long appId,
            @RequestParam("versionNo") String versionNo,
            @RequestParam("versionSize") BigDecimal versionSize,
            @RequestParam("publishStatus") Long publishStatus,
            @RequestParam("versionInfo") String versionInfo,
            @RequestParam(value = "a_downloadLink",required = false) MultipartFile a_downloadLink,
            Model model
    ) throws IOException {
        //保存数据库的路径
        String sqlPath = null;
        //定义文件保存的本地路径
        String localPath="D:\\IntelliJ IDEA 2019.2.1\\MyssmTest\\src\\main\\webapp\\statics\\apk\\";
        //定义 文件名
        String filename =null;
        if(!a_downloadLink.isEmpty()){
            //生成uuid作为文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            String suffixName = a_downloadLink.getOriginalFilename().split("\\.")[1];
            filename = uuid+"."+suffixName;
            if (!suffixName.equals("apk")){
                return addVersion(appId,model);
            }
            a_downloadLink.transferTo(new File(localPath+filename));
        }

        AppVersion appVersion = new AppVersion();
        appVersion.setDownloadlink("/statics/apk/"+filename);
        appVersion.setApkfilename(filename);
        appVersion.setApklocpath(localPath+filename);
        appVersion.setAppid(appId);
        appVersion.setVersionno(versionNo);
        appVersion.setVersionsize(versionSize);
        appVersion.setPublishstatus(publishStatus);
        appVersion.setVersioninfo(versionInfo);
        appVersion.setCreationdate(new Date());
        int b = devService.insertSelective(appVersion);//selectKey会返回id
        /*更新最新版本*/
        AppInfo appInfo = new AppInfo();
        appInfo.setId(appId);
        appInfo.setVersionid(appVersion.getId());
        devService.updateByPrimaryKeySelective(appInfo);
        if (b>0) {
            return addVersion(appId, model);
        }else{
            return addVersion(appId, model);
        }
    }

    /*---------------------------------上下架-----------------------------------*/
    @RequestMapping(
            value = {"/sale.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public Object sale(@RequestParam Long id, HttpSession session) {
        HashMap<String, Object> resultMap = new HashMap();
        resultMap.put("errorCode", "0");
        resultMap.put("appId", id);
        if (id>0){
            try {
                DevUser devUser = (DevUser)session.getAttribute("devUserSession");
                AppInfo appInfo = new AppInfo();
                appInfo.setId(id);
                appInfo.setModifyby(devUser.getId());
                AppInfo appInfo1 = devService.selectByPrimaryKey(id);
                if (appInfo1.getStatus()==4){
                    appInfo.setStatus((long) 5);
                }else {
                    appInfo.setStatus((long) 4);
                }
                if (devService.updateByPrimaryKeySelective(appInfo)>0) {
                    resultMap.put("resultMsg", "success");
                } else {
                    resultMap.put("resultMsg", "success");
                }
            } catch (Exception var7) {
                resultMap.put("errorCode", "exception000001");
            }
        }
        return resultMap;
    }

    /*-------------------------------------------版本信息----------------------------------------*/
    @RequestMapping(
            value = {"/appversionmodify"},
            method = {RequestMethod.GET}
    )//被下面调用了，改的话下面也要改
    public String modifyAppVersion(@RequestParam("vid") Long versionId,
                                   @RequestParam("aid") Long appId,
                                   Model model)
    {
        model.addAttribute("appId",appId);
        AppVersion appVersion = devService.selectPrimaryKey(versionId);
        model.addAttribute("appVersion",appVersion);
        AppInfo appInfo = devService.selectByPrimaryKey(appId);
        String name = appInfo.getSoftwarename();
        List<AppVersion> list = devService.selectVersioned(appId);
        List<AppVersion> list2 = new ArrayList<>();
        for (AppVersion l:list){
            l.setAppname(name);
            l.setPublishStatusname(devService.selectStatus(l.getPublishstatus()).getValuename());
            list2.add(l);
        }
        model.addAttribute("appVersionList",list2);
        return "developer/appversionmodify";
    }

    /*-----------------------------------------------修改版本信息-----------------------------*/
    @RequestMapping(
            value = {"/appversionmodifysave"},
            method = {RequestMethod.POST}
    )
    public String modifyAppVersionSave(@RequestParam("id") Long id,
                                       @RequestParam("appId") Long appId,
                                       @RequestParam("versionSize") BigDecimal versionSize,
                                       @RequestParam("versionInfo") String versionInfo,
                                       HttpSession session,
                                       Model model,
                                       HttpServletRequest request,
                                       @RequestParam(value = "attach",required = false) MultipartFile attach) {
        DevUser devUser = (DevUser)session.getAttribute("devUserSession");
        AppVersion appVersion = new AppVersion();
        appVersion.setId(id);
        appVersion.setVersionsize(versionSize);
        appVersion.setVersioninfo(versionInfo);
        appVersion.setModifydate(new Date());
        appVersion.setModifyby(devUser.getId());
        devService.updateByPrimaryKeySelective(appVersion);
        return modifyAppVersion(id,appId,model);//调用了上面方法，上面改了下面也要改
    }
    /*--------------------------------------查看基本信息----------------------------------*/
    @RequestMapping(
            value = {"/appview"},
            method = {RequestMethod.GET}
    )//被下面调用了
    public String view(@RequestParam Long id, Model model) {
        AppInfo l = devService.selectByPrimaryKey(id);
        String name = l.getSoftwarename();
        l.setFlatformname(devService.selectType(l.getFlatformid()).getValuename());
        l.setStatu(devService.selectStatus(l.getStatus()).getValuename());
        l.setCategorylevelname1(devService.selectCate(l.getCategorylevel1()));
        l.setCategorylevelname2(devService.selectCate(l.getCategorylevel2()));
        l.setCategorylevelname3(devService.selectCate(l.getCategorylevel3()));
        l.setVersionname(devService.selectVersion(l.getVersionid()));

        List<AppVersion> list = devService.selectVersioned(id);
        List<AppVersion> list2 = new ArrayList<>();
        for (AppVersion li:list){
            li.setAppname(name);
            li.setPublishStatusname(devService.selectStatus(li.getPublishstatus()).getValuename());
            list2.add(li);
        }
        model.addAttribute("appVersionList",list2);
        model.addAttribute("appInfo",l);
        return "developer/appinfoview";
    }
    /*----------------------------------------------修改app基本信息界面----------------------------*/
    @RequestMapping(
            value = {"/appinfomodify"},
            method = {RequestMethod.GET}
    )
    public String modifyAppInfo(@RequestParam("id") Long id,
                                Model model) {
        AppInfo l = devService.selectByPrimaryKey(id);
        l.setFlatformname(devService.selectType(l.getFlatformid()).getValuename());
        l.setStatu(devService.selectStatus(l.getStatus()).getValuename());
        l.setCategorylevelname1(devService.selectCate(l.getCategorylevel1()));
        l.setCategorylevelname2(devService.selectCate(l.getCategorylevel2()));
        l.setCategorylevelname3(devService.selectCate(l.getCategorylevel3()));
        l.setVersionname(devService.selectVersion(l.getVersionid()));
        model.addAttribute("appInfo",l);
        return "developer/appinfomodify";
    }

    /*-------------------------------------------------修改app基本信息---------------------------------*/
    @RequestMapping(
            value = {"/appinfomodifysave"},
            method = {RequestMethod.POST}
    )
    public String modifySave(@RequestParam("id") Long id,
                             @RequestParam("softwareName") String softwareName,
                             @RequestParam("appInfo") String appInfo,
                             @RequestParam("supportROM") String supportROM,
                             @RequestParam("interfaceLanguage") String interfaceLanguage,
                             @RequestParam("softwareSize") BigDecimal softwareSize,
                             @RequestParam("downloads") Long downloads,
                             @RequestParam("flatformId") Long flatformId,
                             @RequestParam("categoryLevel1") Long categoryLevel1,
                             @RequestParam("categoryLevel2") Long categoryLevel2,
                             @RequestParam("categoryLevel3") Long categoryLevel3,
                             HttpSession session,
                             Model model,
                             HttpServletRequest request) {
        DevUser devUser = (DevUser)session.getAttribute("devUserSession");
        AppInfo app = new AppInfo();
        app.setId(id);
        app.setSoftwarename(softwareName);
        app.setAppinfo(appInfo);
        app.setSupportrom(supportROM);
        app.setInterfacelanguage(interfaceLanguage);
        app.setSoftwaresize(softwareSize);
        app.setDownloads(downloads);
        app.setFlatformid(flatformId);
        app.setCategorylevel1(categoryLevel1);
        app.setCategorylevel2(categoryLevel2);
        app.setCategorylevel3(categoryLevel3);
        app.setModifydate(new Date());
        app.setModifyby(devUser.getId());
        devService.updateByPrimaryKeySelective(app);
        return modifyAppInfo(id,model);
    }

    /*-----------------------------------------删除app---------------------------------*/
    @RequestMapping({"/delapp.json"})
    @ResponseBody
    public Object delApp(@RequestParam Long id) {
        HashMap<String, String> resultMap = new HashMap();
        if (id==0) {
            resultMap.put("delResult", "notexist");
        } else {
            try {
                if (devService.deleteApp(id)>0) {
                    resultMap.put("delResult", "true");
                } else {
                    resultMap.put("delResult", "false");
                }
            } catch (NumberFormatException var4) {
                var4.printStackTrace();
            } catch (Exception var5) {
                var5.printStackTrace();
            }
        }
        return JSONArray.toJSONString(resultMap);
    }
}
