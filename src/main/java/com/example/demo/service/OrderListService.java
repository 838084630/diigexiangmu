package com.example.demo.service;

import com.example.demo.dao.OrderListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderListService {
    @Autowired
    private OrderListDao orderListDao;
    public String updateNum(String productId, String orderNum) {
        return orderListDao.updateNum(productId,orderNum);
    }
}
