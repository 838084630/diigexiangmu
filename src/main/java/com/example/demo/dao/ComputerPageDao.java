package com.example.demo.dao;

import com.example.demo.mapper.ComputerPageMapper;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Repository
public class ComputerPageDao {
    @Autowired
    private ComputerPageMapper computerPageMapper;
    public List<Product> queryAllByStoreId(String number) {
        return  computerPageMapper.queryAllByStoreId(number);
    }
}
