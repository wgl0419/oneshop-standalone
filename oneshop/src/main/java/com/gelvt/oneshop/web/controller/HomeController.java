package com.gelvt.oneshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * Desc: 前台页面控制器
 * Author: Elvin Zeng
 * Date: 17-6-20.
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = {"/"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/about"})
    @ResponseBody
    public Map<String, Object> about() {
        Map<String, Object> ret = new HashMap<>();
        ret.put("success", true);
        ret.put("message", "https://github.com/elvinzeng/oneshop-standalone");
        return ret;
    }
}
