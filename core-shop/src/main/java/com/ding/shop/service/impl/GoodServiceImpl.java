package com.ding.shop.service.impl;

import com.ding.shop.dao.GoodDao;
import com.ding.shop.model.GoodDo;
import com.ding.shop.service.GoodService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
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

        return goodDao.insert(goodDo);
    }
}
