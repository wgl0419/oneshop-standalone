package com.gelvt.oneshop.web.controller;

import com.gelvt.oneshop.web.ServletInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @RequestMapping(value = {"/"})
    public String index() {
        /*logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");*/
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
