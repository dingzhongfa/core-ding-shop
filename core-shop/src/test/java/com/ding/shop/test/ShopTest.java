package com.ding.shop.test;

import com.ding.shop.config.AppConfig;
import com.ding.shop.model.GoodDo;
import com.ding.shop.service.GoodService;
import com.github.pagehelper.Page;
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
        for (int i=1;i<=1000;i++){
            goodDo.setGId(i+"");
            goodDo.setGName(i+"榴莲");
            goodDo.setSId(i+"号商铺");
            goodDo.setPrice(1000);
            System.out.println(goodService.addGood(goodDo));
        }
    }

    @Test
    public void  testSelect(){
        GoodDo goodDo = new GoodDo();
//        goodDo.setPrice(500);
        goodDo.setGName("159榴莲");
        Page<GoodDo> page = goodService.queryGoodList(goodDo);
        System.out.println("分页信息如下：");
        System.out.println(page.getPageNum());
        for ( GoodDo goodDo1:page){
            System.out.println(goodDo1);
        }
    }
}
