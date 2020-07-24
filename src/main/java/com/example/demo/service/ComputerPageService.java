package com.example.demo.service;

import com.example.demo.dao.ComputerPageDao;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComputerPageService {
    @Autowired
    private ComputerPageDao computerPageDao;
    public List<Product> queryAllByStoreId(String number) {
//        System.out.println("xxxxxxxxxxx"+number);
        return computerPageDao.queryAllByStoreId(number);
    }
}
