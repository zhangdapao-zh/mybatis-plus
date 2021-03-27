package com.zhuhao.demomybatis.blog.controller;


import com.zhuhao.demomybatis.blog.entity.User;
import com.zhuhao.demomybatis.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhu
 * @since 2021-03-27
 */
@RestController
@RequestMapping("/blog/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/a/{id}")
    public User selectById(@PathVariable("id") Integer id){
        return userService.selectById(id);
    }
}

