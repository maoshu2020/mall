package com.example.mall.model.entity;

import com.example.mall.model.vo.UserVO;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author jay
 */
@Data
public class Account extends UserVO implements UserDetails {
    private String username;

    private String password;

    private List<Role> roles;

    public Account(UserVO userVO){
        this.username=userVO.getUserName();
        this.password=userVO.getUserPassword();
        this.roles=userVO.getRoles();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> list=new ArrayList<>();
//        for(Role role:roles){
//            list.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
//        }
//        return list;
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
