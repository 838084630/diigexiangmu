package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.MemoryPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemoryPageController {
    @Autowired
    private MemoryPageService memoryPageService;

    @RequestMapping("/memoryOrder")
    public String memoryOrder(){
        return "memoryOrder";
    }
    @RequestMapping("/memoryPage")
    @ResponseBody
    public List<Product> queryAllByStoreId(String number){
        System.out.println("XXXXXXXXXX"+number);
            return memoryPageService.queryAllByStoreId(number);
    }
}
