package com.eknows;

import com.eknows.model.bean.entity.User;
import com.eknows.model.dao.UserDAO;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    private UserDAO userDAO;

    @org.junit.Test
    public void test() {
        User user = new User();
        user.setName("你好啊");
        user.setPassword("123456");
        user.setAddress("不知道的");
        user.setLastLoginTime(new Date());
        userDAO.insert(user);
    }
}
