package com.example.demo.service;

import com.example.demo.dao.OrderListDao;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderListService {
    double total = 0 ;
    @Autowired
    private OrderListDao orderListDao;
    public String updateNum(String productId, Integer stockNum, String orderNum) {
        return orderListDao.updateNum(productId, stockNum,orderNum);
    }

    public int checkStockById(String productId) {
        return orderListDao.checkStockById(productId);
    }

    public void showCartList(Model model) {
        List<Product> cartList = orderListDao.showCartList();
        for (int i = 0; i < cartList.size(); i++) {
            double productPrice = cartList.get(i).getProductPrice();
            int productOut = cartList.get(i).getProductOut();
            double zongjia = productPrice * productOut;
            total+=zongjia;
            System.out.println("========"+cartList.get(i));
        }
        System.out.println("total====="+total);
//        HashMap<Object, Object> cartListAndTotal = new HashMap<>();
//        cartListAndTotal.put("cartList",cartList);
//        cartListAndTotal.put("total",total);
        model.addAttribute("cartList",cartList);

    }

    public String queryTotal() {
        System.out.println("total"+total);
        return String.valueOf(total);
    }
}
