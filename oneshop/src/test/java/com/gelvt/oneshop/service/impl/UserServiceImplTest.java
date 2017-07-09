package com.gelvt.oneshop.service.impl; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* UserServiceImpl Tester. 
* 
* @author Elvin Zeng
* @since <pre>七月 9, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserServiceImplTest { 

    @Before
    public void before() throws Exception { 
    
    } 

    @After
    public void after() throws Exception { 
    
    } 

    /** 
    * 
    * Method: isUsernameExists(String username) 
    * 
    */ 
    @Test
    public void testIsUsernameExists() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: isEmailExists(String email) 
    * 
    */ 
    @Test
    public void testIsEmailExists() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: isMobileNoExists(String mobileNo) 
    * 
    */ 
    @Test
    public void testIsMobileNoExists() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: saveUser(User userInfo) 
    * 
    */ 
    @Test
    public void testSaveUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: activateEmail(Long userId, String email) 
    * 
    */ 
    @Test
    public void testActivateEmail() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: changeEmail(Long userId, String newEmail) 
    * 
    */ 
    @Test
    public void testChangeEmail() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: changeUsername(Long userId, String newUsername) 
    * 
    */ 
    @Test
    public void testChangeUsername() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: deleteUser(Long userId) 
    * 
    */ 
    @Test
    public void testDeleteUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: freeze(User user) 
    * 
    */ 
    @Test
    public void testFreeze() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: activate(User user) 
    * 
    */ 
    @Test
    public void testActivate() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: loadUserByUserId(Long userId) 
    * 
    */ 
    @Test
    public void testLoadUserByUserId() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: loadUserByLoginName(String loginName) 
    * 
    */ 
    @Test
    public void testLoadUserByLoginName() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: asignRoleToUser(User user, Role role) 
    * 
    */ 
    @Test
    public void testAsignRoleToUser() throws Exception { 
        //TODO: Test goes here... 
    } 

    /** 
    * 
    * Method: revokeRoleFromUser(User user, Role role) 
    * 
    */ 
    @Test
    public void testRevokeRoleFromUser() throws Exception { 
        //TODO: Test goes here... 
    } 


    /** 
    * 
    * Method: encodePassword(String password, String salt) 
    * 
    */ 
    @Test
    public void testEncodePassword() throws Exception { 
    //TODO: Test goes here... 
        /* 
        try { 
           Method method = UserServiceImpl.getClass().getMethod("encodePassword", String.class, String.class); 
           method.setAccessible(true); 
           method.invoke(<Object>, <Parameters>); 
        } catch(NoSuchMethodException e) { 
        } catch(IllegalAccessException e) { 
        } catch(InvocationTargetException e) { 
        } 
        */ 
        } 

    /** 
    * 
    * Method: generateSalt() 
    * 
    */ 
    @Test
    public void testGenerateSalt() throws Exception { 
    //TODO: Test goes here... 
        /* 
        try { 
           Method method = UserServiceImpl.getClass().getMethod("generateSalt"); 
           method.setAccessible(true); 
           method.invoke(<Object>, <Parameters>); 
        } catch(NoSuchMethodException e) { 
        } catch(IllegalAccessException e) { 
        } catch(InvocationTargetException e) { 
        } 
        */ 
        } 

} 
