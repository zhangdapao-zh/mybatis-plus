package com.zhuhao.demomybatis.blog.service.impl;

import com.zhuhao.demomybatis.blog.entity.User;
import com.zhuhao.demomybatis.blog.mapper.UserMapper;
import com.zhuhao.demomybatis.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhu
 * @since 2021-03-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
