package com.example.demo.service;

import com.example.demo.dao.OrderListDao;
import com.example.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderListService {

    @Autowired
    private OrderListDao orderListDao;
    public String updateNum(String productId, Integer stockNum, String orderNum) {
        return orderListDao.updateNum(productId, stockNum,orderNum);
    }

    public int checkStockById(String productId) {
        return orderListDao.checkStockById(productId);
    }

    public void showCartList(HttpServletRequest request) {
        double total = 0 ;
        HttpSession session = request.getSession();
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
        session.setAttribute("cartList",cartList);
        String t = "" + total;
        session.setAttribute("total",t);

    }

    public int queryInputIsZero(String productId) {

        int i = orderListDao.queryInputIsZero(productId);
        return i;
    }

    public String additionalOrder(String productId, int stockNum, String orderNum, int inputIsZero) {
        return orderListDao.additionalOrder(productId,stockNum,orderNum,inputIsZero);
    }

//    public String queryTotal() {
//        System.out.println("total"+total);
//        return String.valueOf(total);
//    }
}
