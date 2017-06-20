package com.gelvt.oneshop.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Desc: 前台页面控制器
 * Author: Elvin Zeng
 * Date: 17-6-20.
 */
@RestController
public class HomeController {
    
    @RequestMapping(value = {"/"})
    public String index() {
        return "index";
    }
}
