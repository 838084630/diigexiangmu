package com.example.demo.dao;

import com.example.demo.mapper.OrderListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderListDao {
    @Autowired
    private OrderListMapper orderListMapper;
    public String updateNum(String productId, String orderNum) {
        return orderListMapper.updateNum(productId,orderNum);
    }
}
