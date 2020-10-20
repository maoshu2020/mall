package com.example.mall.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 拼夕夕
 * @since 2020-10-18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @PreAuthorize("a120")
    public void add(){

    }
}

