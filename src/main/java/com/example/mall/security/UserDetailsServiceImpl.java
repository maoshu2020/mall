package com.example.mall.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mall.dao.UserDao;
import com.example.mall.model.entity.Account;
import com.example.mall.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jay
 */
@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<UserVO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("u.user_name",s);
        UserVO userVO = userDao.getUserJoinRole(queryWrapper);
        log.info(userVO.toString());
        Account account = new Account(userVO);
        return account;
    }
}
