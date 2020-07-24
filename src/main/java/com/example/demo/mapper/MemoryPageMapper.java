package com.example.demo.mapper;

import com.example.demo.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface MemoryPageMapper {
    @Select("select * from product where store_name=(select store_name from home where id=#{number}) and product_version like 'VS%' ")
    List<Product> queryAllByStoreId(String number);
}
