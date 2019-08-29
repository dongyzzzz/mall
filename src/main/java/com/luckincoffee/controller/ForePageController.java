package com.luckincoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: dyz
 * @Date: 2019/8/28 15:31
 * @Description: 前台页面跳转控制器
 */
@Controller
public class ForePageController {
    @GetMapping(value = "/")
    public String index(){
        return "redirect:home";
    }
    @GetMapping(value = "home")
    public String home(){
        return "fore/home";
    }

}