package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.ComputerPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ComputerPageController {
    @Autowired
    private ComputerPageService computerPageService;


//    @RequestMapping("/computerOrder")
//    public String computerOrder(){
//        return "computerOrder";
//    }
    @RequestMapping("/computerPage")
    public String queryAllByStoreId(String number, Model model){

       List<Product> computers = computerPageService.queryAllByStoreId(number);

       model.addAttribute("computers",computers);
//        map.put("computers",computers);

       return "computerOrder";
    }


}
