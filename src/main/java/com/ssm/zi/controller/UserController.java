package com.ssm.zi.controller;

import com.alibaba.fastjson.JSONArray;
import com.ssm.zi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private GoodsService userService;
    @RequestMapping("/test")
    public String test(){
        JSONArray array = new JSONArray();
        return null;
    }
//    @RequestMapping("/haha")
//    public @ResponseBody List haha() {
//        List<SmbmsUser> list = userService.listUser();
//        for (SmbmsUser user:list){
//            System.out.println(user);
//        }
//        return list;
//    }

}
