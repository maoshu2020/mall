package com.example.mall.model.vo;

import com.example.mall.model.entity.Role;
import com.example.mall.model.entity.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class UserVO extends User {
    private List<Role> roles;
}
