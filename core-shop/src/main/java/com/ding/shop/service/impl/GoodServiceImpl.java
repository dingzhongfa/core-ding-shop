package com.ding.shop.service.impl;

import com.ding.shop.dao.GoodDao;
import com.ding.shop.model.GoodDo;
import com.ding.shop.service.GoodService;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hzdzf on 2017/1/13.
 */

@Service
@Transactional
public class GoodServiceImpl implements GoodService {

    private Logger logger = LoggerFactory.getLogger(GoodServiceImpl.class);

    @Resource
    private GoodDao goodDao;


    @Override
    public int addGood(GoodDo goodDo) {
        Assert.notNull(goodDo, "查询参数不能为空");
        return goodDao.insert(goodDo);
    }

    @Override
    public Page<GoodDo> queryGoodList(GoodDo goodDo) {
        Page<GoodDo> page = PageHelper.startPage(2, 10, true);
        List<GoodDo> list = goodDao.selectList(goodDo);
        System.out.println("查询信息如下");
        for (GoodDo goodDo1:list){
            System.out.println(goodDo1);
        }
        return page;
    }
}
