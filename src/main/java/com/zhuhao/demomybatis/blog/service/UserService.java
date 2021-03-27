package com.zhuhao.demomybatis.blog.service;

import com.zhuhao.demomybatis.blog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhu
 * @since 2021-03-27
 */
public interface UserService extends IService<User> {

    User selectById(Integer id);
}
