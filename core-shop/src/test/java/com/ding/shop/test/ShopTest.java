package com.ding.shop.test;

import com.ding.shop.config.AppConfig;
import com.ding.shop.model.GoodDo;
import com.ding.shop.service.GoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by hzdzf on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ShopTest {

    @Autowired
    private GoodService goodService;

    @Test
    public void testInsert(){
        GoodDo goodDo = new GoodDo();
        goodDo.setGId("18");
        goodDo.setGName("hello");
        goodDo.setSId("werwer");
        goodDo.setPrice(411365);
        System.out.println(goodService.addGood(goodDo));
    }
}
