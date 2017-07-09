package com.gelvt.oneshop.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * PermissionMapper Tester
 * @author: Elvin Zeng
 * @date: 17-7-9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest()
public class PermissionMapperTests {

    @Autowired
    private PermissionMapper permissionMapper;

    @Test
    public void testSave(){
        /*Permission permission = new Permission();
        permission.setName("test");
        permission.setRemark("test");
        permissionMapper.save(permission);*/
    }

    @Test
    public void testGet(){

    }
}
