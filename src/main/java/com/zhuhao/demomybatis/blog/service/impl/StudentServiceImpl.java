package com.zhuhao.demomybatis.blog.service.impl;

import com.zhuhao.demomybatis.blog.entity.Student;
import com.zhuhao.demomybatis.blog.mapper.StudentMapper;
import com.zhuhao.demomybatis.blog.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
