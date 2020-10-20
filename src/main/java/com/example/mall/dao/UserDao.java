package com.example.mall.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.mall.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mall.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
public interface UserDao extends BaseMapper<User> {
    User selectByLogin(@Param(Constants.WRAPPER) Wrapper<User> queryWrapper);
    UserVO getUserJoinRole(@Param(Constants.WRAPPER) QueryWrapper<?> wrapper);
}
