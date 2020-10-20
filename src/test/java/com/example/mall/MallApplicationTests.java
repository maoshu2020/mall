package com.example.mall;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mall.dao.UserDao;
import com.example.mall.model.entity.User;
import com.example.mall.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        userDao.selectByLogin(new QueryWrapper<User>());
    }

}
