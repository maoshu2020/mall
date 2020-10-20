package com.example.mall.service;

import com.example.mall.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
public interface UserService extends IService<User> {
    boolean add(User user);
    boolean update(User user);

    List<User> getList(User user);
    User get(Integer user_id);
    User login(String user_name, String user_password);
    Integer getTotal(User user);
}
