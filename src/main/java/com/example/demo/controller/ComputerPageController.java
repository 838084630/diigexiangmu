package com.example.demo.controller;

import com.example.demo.pojo.Home;
import com.example.demo.pojo.Product;
import com.example.demo.service.ComputerPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ComputerPageController {
    @Autowired
    private ComputerPageService computerPageService;


//    @RequestMapping("/computerOrder")
//    public String computerOrder(){
//        return "computerOrder";
//    }
    @RequestMapping("/computerPage")
    public String queryAllByStoreId(String number,Model model){

       List<Product> computerData = computerPageService.queryAllByStoreId(number);
       model.addAttribute("computerData",computerData);
       return "computerOrder";
    }


}
