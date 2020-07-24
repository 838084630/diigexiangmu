package com.example.demo.mapper;

import com.example.demo.pojo.Home;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FirstPageMapper {
    @Select("select * from home")
    List<Home> queryStores();
}
