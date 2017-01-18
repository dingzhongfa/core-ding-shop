package com.ding.shop.service.impl;

import com.ding.shop.dao.GoodDao;
import com.ding.shop.model.GoodDo;
import com.ding.shop.service.GoodService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * Created by hzdzf on 2017/1/13.
 */

@Service
public class GoodServiceImpl implements GoodService {

    @Resource
    private GoodDao goodDao;


    @Override
    public int addGood(GoodDo goodDo) {

        return goodDao.insert(goodDo);
    }
}
