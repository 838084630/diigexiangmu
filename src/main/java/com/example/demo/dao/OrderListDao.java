package com.example.demo.dao;

import com.example.demo.mapper.OrderListMapper;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderListDao {
    @Autowired
    private OrderListMapper orderListMapper;
    public String updateNum(String productId, Integer stockNum, String orderNum) {

        int result = orderListMapper.updateNum(productId, stockNum, orderNum);
        return String.valueOf(result);
    }

    public int checkStockById(String productId) {
        return orderListMapper.checkStockById(productId);
    }

    public List<Product> showCartList() {
        return orderListMapper.showCartList();
    }

    public int queryInputIsZero(String productId) {
         return orderListMapper.queryInputIsZero(productId);
    }

    public String additionalOrder(String productId, int stockNum, String orderNum, int inputIsZero) {

        return orderListMapper.additionalOrder(productId,stockNum,orderNum,inputIsZero);
    }
}
