package com.ssm.zi.controller;


import com.ssm.zi.model.AppCategory;
import com.ssm.zi.model.AppInfo;
import com.ssm.zi.model.BackendUser;
import com.ssm.zi.model.DataDictionary;
import com.ssm.zi.service.BackendService;
import com.ssm.zi.service.DevService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class BackendController {

    @Autowired
    private BackendService backendService;

    @RequestMapping("/login")
    public String devlogin(){
        return "backendlogin";
    }

    @RequestMapping("/backend/main")
    public String main(){
        return "/backend/main";
    }
    /*-------Backend登录------*/
    @RequestMapping("/dologin")
    public String dologin(@RequestParam("userCode") String usercode,
                          @RequestParam("userPassword") String userpassword,
                          HttpSession session){
        BackendUser backendUser = backendService.dologin(usercode);
        if (backendUser!=null&&backendUser.getUserpassword().equals(userpassword)) {
            session.setAttribute("backendUserSession",backendUser);
            String typeName = backendService.userTypeById(backendUser.getUsertype());
            session.setAttribute("backendid",typeName);
            return "/backend/main";
        }
        return "backendlogin";
    }

    /*----------查询appInfo列表--------------*/
    @RequestMapping("/backend/app/list")
    public String selectAppList(Model model){
        List<AppInfo> applist = backendService.findAllAppInfo();
        List<DataDictionary> typeList = backendService.selectTypes();
        List<AppCategory> level1List = backendService.selectLevel_1();
        model.addAttribute("appInfoList",demo(applist));
        model.addAttribute("flatFormList",typeList);
        model.addAttribute("categoryLevel1List",level1List);
        return "backend/applist";

    }

/*-----------------关联表--------------------*/
    public List<AppInfo> demo(List<AppInfo> list){
        List<AppInfo> list2 = new ArrayList<>();
        for (AppInfo l:list){
            l.setFlatformname(backendService.selectType(l.getFlatformid()).getValuename());
            l.setStatu(backendService.selectStatus(l.getStatus()).getValuename());
            l.setCategorylevelname1(backendService.selectCate(l.getCategorylevel1()));
            l.setCategorylevelname2(backendService.selectCate(l.getCategorylevel2()));
            l.setCategorylevelname3(backendService.selectCate(l.getCategorylevel3()));
            l.setVersionname(backendService.selectVersion(l.getVersionid()));
            list2.add(l);
        }
        return list2;
    }

    /*---------------二级菜单--------------*/
    @RequestMapping(
            value = {"backend/app/categorylevellist.json"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<AppCategory> getAppCategoryList(@RequestParam String pid) {
        if (pid.equals("")) {
            pid = null;
        }
        return backendService.nox(pid);
    }

    /*----------登出操作--------------*/
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("backendUserSession");
        return "backendlogin";
    }

    /*------------审核APP-------------*/

    @RequestMapping("/backend/app/check")
    public String checkByAppId(Long aid,Model model){
        backendService.checkApp_Pass(aid);
        return selectAppList(model);
    }

    /*------------查询--------------*/
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
        List<AppInfo> list1 = backendService.selectList(appInfo);
        List<DataDictionary> flatFormList = backendService.selectTypes();
        List<AppCategory> categoryLevel1List = backendService.selectLevel_1();
        model.addAttribute("appInfoList",demo(list1));
        model.addAttribute("flatFormList",flatFormList);
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        return "backend/applist";
    }

}
