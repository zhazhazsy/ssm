package com.ssm.zi.controller;

import com.ssm.zi.model.Goods;
import com.ssm.zi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/selectAll")
    public @ResponseBody List selectAll(){
        List<Goods> list = goodsService.selectAll();
        List<Goods> list1 = new ArrayList<>();
        for (Goods l:list){
            l.setSynopsis(l.getName().substring(0,20)+"...");
            list1.add(l);
        }
        return list1;
    }
}
