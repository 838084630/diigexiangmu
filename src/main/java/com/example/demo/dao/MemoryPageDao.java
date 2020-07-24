package com.example.demo.dao;

import com.example.demo.mapper.MemoryPageMapper;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository
public class MemoryPageDao {
    @Autowired
    private MemoryPageMapper memoryPageMapper;
    public List<Product> queryAllByStoreId(String number) {
        return memoryPageMapper.queryAllByStoreId(number);
    }
}
