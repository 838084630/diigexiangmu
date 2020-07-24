package com.example.demo.service;

import com.example.demo.dao.FirstPageDao;
import com.example.demo.pojo.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FirstPageService {

    @Autowired
    private FirstPageDao firstPageDao;
    public List<Home> queryStores() {
        return firstPageDao.queryStores();
    }
}
