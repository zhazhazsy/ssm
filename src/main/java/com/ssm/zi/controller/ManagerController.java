package com.ssm.zi.controller;

import com.ssm.zi.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage")
public class ManagerController {
    @Autowired
    private DevService devService;

    @RequestMapping("/login")
    public String devlogin(){
        return "/backendlogin";
    }

    @RequestMapping("/dologin")
    public String dologin(){
        return "backend/main";
    }
}
