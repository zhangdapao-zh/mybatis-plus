package com.zhuhao.demomybatis;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhuhao.demomybatis.mapper.StudentMapper;
import com.zhuhao.demomybatis.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WrapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test003() {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name")
                .eq("name", "lisi");
        studentMapper.selectList(wrapper).forEach(System.out::println);
    }

    @Test
    public void test004() {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "lisi");
        Student student = studentMapper.selectOne(wrapper);
        System.out.println(student);
    }

    @Test
    public void test005() {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.inSql("id","select id from student where id<4");
        List<Object> objects = studentMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }
    @Test
    public void test006() {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("id");
        List<Student> students = studentMapper.selectList(wrapper);
        students.forEach(System.out::println);
    }
}

