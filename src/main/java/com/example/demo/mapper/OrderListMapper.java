package com.example.demo.mapper;

import com.example.demo.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderListMapper {
    @Select("select product_stock from product where id = #{productId}")
    int checkStockById(String productId);
    @Update("update product set product_out = #{orderNum},product_stock = #{stockNum}-#{orderNum} where id = #{productId}")
    int updateNum(String productId, Integer stockNum, String orderNum);
    @Select("select store_Name,product_version,product_price,product_out from product where product_out !=0 ")
    List<Product> showCartList();

}
