package com.example.demo.controller;

import com.example.demo.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderListController {
    @Autowired
    private OrderListService orderListService;
    @RequestMapping("/changeOrderNum")
    public String updateNum(String productId,String orderNum) {
        return orderListService.updateNum(productId, orderNum);
    }

}
