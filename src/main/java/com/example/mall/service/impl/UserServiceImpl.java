package com.example.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mall.model.entity.User;
import com.example.mall.dao.UserDao;
import com.example.mall.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public boolean add(User user) {
        return userDao.insert(user)>0;
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user,new UpdateWrapper<User>()
                .set(StringUtils.isNotBlank(user.getUserPassword()),"userPassword",user.getUserPassword())
                .set(StringUtils.isNotBlank(user.getUserNickname()),"userNickname",user.getUserNickname())
                .set(StringUtils.isNotBlank(user.getUserRealname()),"userRealname",user.getUserRealname())
                .set("userGender",user.getUserGender())
                .set("userBirthday",user.getUserBirthday())
                .set(StringUtils.isNotBlank(user.getUserProfilePictureSrc()),"userProfilePictureSrc",user.getUserProfilePictureSrc())
                .set(StringUtils.isNoneBlank(user.getUserAddress()),"userAddress",user.getUserAddress())
                .eq("userAddress",user.getUserAddress()))>0;
    }

    @Override
    public List<User> getList(User user) {
        return userDao.selectList(new QueryWrapper<User>().like(StringUtils.isNoneBlank(user.getUserName()),"userName",user.getUserName())
                .or()
                .like(StringUtils.isNoneBlank(user.getUserNickname()),"userNickname",user.getUserNickname())
                .eq("userGender",user.getUserGender()));
    }

    @Override
    public User get(Integer user_id) {

        return userDao.selectOne(new QueryWrapper<User>().eq("Id",user_id));
    }

    @Override
    public User login(String user_name, String user_password) {
        return userDao.selectByLogin(new QueryWrapper<User>().eq("userName",user_name).eq("userPassword",user_password));
    }

    @Override
    public Integer getTotal(User user) {
        return userDao.selectCount(new QueryWrapper<User>().like("userName",user.getUserName())
                .or().like("userNickName",user.getUserName())
                .eq("userGender",user.getUserGender()));
    }
}
