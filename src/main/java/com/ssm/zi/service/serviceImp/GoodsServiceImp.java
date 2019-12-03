package com.ssm.zi.service.serviceImp;

import com.ssm.zi.dao.GoodsMapper;
import com.ssm.zi.model.Goods;
import com.ssm.zi.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class GoodsServiceImp implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }
}
