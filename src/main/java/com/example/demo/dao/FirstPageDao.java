package com.example.demo.dao;

import com.example.demo.mapper.FirstPageMapper;
import com.example.demo.pojo.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FirstPageDao {
    @Autowired
    private FirstPageMapper firstPageMapper;
    public List<Home> queryStores() {
        return firstPageMapper.queryStores();
    }
}
