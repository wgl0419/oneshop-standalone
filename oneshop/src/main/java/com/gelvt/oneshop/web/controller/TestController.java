package com.gelvt.oneshop.web.controller;

import com.gelvt.oneshop.model.Permission;
import com.gelvt.oneshop.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * Controller for test
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */
@Controller
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource(name = "permissionServiceImpl")
    private PermissionService permissionService;
    
    @RequestMapping(value = {"/test"})
    @ResponseBody
    public Map<String, Object> test() {

        /*Permission permission = new Permission();
        permission.setName("test");
        permission.setRemark("test");
        permissionService.savePermission(permission);*/

        Map<String, Object> ret = new HashMap<>();
        ret.put("success", true);
        ret.put("message", "https://github.com/elvinzeng/oneshop-standalone");
        return ret;
    }
}
