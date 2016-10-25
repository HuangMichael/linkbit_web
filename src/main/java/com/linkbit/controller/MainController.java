package com.linkbit.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2016年10月25日
 */
@Controller
@EnableAutoConfiguration
public class MainController {


    @RequestMapping("/")
    public String home() {

        return "index";
    }
}