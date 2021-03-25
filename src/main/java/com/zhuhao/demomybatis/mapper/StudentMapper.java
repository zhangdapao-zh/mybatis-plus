package com.zhuhao.demomybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuhao.demomybatis.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
