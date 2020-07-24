package com.example.demo.controller;

import com.example.demo.pojo.Home;
import com.example.demo.service.FirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FirstPageShowDateController {
    @Autowired
    private FirstPageService firstPageService;


//    public ModelAndView index(ModelAndView model){
//        model.setViewName("firstPage");
//        return model;
//    }

    @RequestMapping("/")
    public String showHome(Model model){
        List<Home> homeData = firstPageService.queryStores();
        model.addAttribute("homeData",homeData);
        return "firstPage";
    }
//    @RequestMapping("/homeData")
//    @ResponseBody
//    public String  queryStores(Model model){
//        List<Home> homeData = firstPageService.queryStores();
////        System.out.println("*****************"+aa);
//
//        return firstPageService.queryStores();
//
//    }


}
