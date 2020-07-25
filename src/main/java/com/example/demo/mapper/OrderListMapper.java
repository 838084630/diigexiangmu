package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderListMapper {
//    @Select("update product set product_out = #{orderNum},product_stock =  where id = #{productId}")
    String updateNum(String productId, String orderNum);
}
