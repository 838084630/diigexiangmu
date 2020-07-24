package com.example.demo.service;

import com.example.demo.dao.MemoryPageDao;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemoryPageService {
    @Autowired
    private MemoryPageDao memoryPageDao;
    public List<Product> queryAllByStoreId(String number) {
        return memoryPageDao.queryAllByStoreId(number);
    }
}
