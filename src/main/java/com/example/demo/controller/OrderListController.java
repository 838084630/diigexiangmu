package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.OrderListService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.rmi.PortableRemoteObject;
import java.util.List;
import java.util.Map;

@Controller
public class OrderListController {
    @Autowired
    private OrderListService orderListService;
    @RequestMapping("/changeOrderNum")
    public String updateNum(String productId, String orderNum) {

        int orderNums = Integer.parseInt(orderNum);
        int stockNum = orderListService.checkStockById(productId);
        if (orderNums < stockNum){
             orderListService.updateNum(productId, stockNum, orderNum);
        }
//         model.addAttribute("",)
        return "memoryOrder";
    }
//    @ResponseBody
//    public String ajaxList(@RequestParam("list") List<Product> computerList) throws Exception{
//        for (Product str : computerList) {
//            System.out.println(str+"xxx");
//        }
//
//
//        return "OK";
//    }


//    订单页显示
    @RequestMapping("/cart")
    public String showCartList(Model model){
        orderListService.showCartList(model);
        return "cart";
    }

//    获取总价
    @RequestMapping("/queryTotal")
    @ResponseBody
    public String queryTotal(){
        return orderListService.queryTotal();

    }

}
