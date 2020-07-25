package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.MemoryPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemoryPageController {
    @Autowired
    private MemoryPageService memoryPageService;

    @RequestMapping("/memoryPage")
    public String queryAllByStoreId(String number, Model model){
            List<Product> memories =  memoryPageService.queryAllByStoreId(number);

            model.addAttribute("memories",memories);
            return "memoryOrder";
    }
}
