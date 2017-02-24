package com.ding.shop.dao;

import com.ding.shop.model.GoodDo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface GoodDao {


    /**
     * 新增记录
     * @param record 待新增的对象
     */
    int insert(GoodDo record);

    /**
     * 新增记录 <font color='blue'>（该操作为选择性的，只对record中不为空的属性生成sql语句）</font>
     * @param record 待新增的对象
     */
    int insertSelective(GoodDo record);


    List<GoodDo> selectList(GoodDo goodDo);
}