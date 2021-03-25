package com.zhuhao.demomybatis;

import com.zhuhao.demomybatis.mapper.StudentMapper;
import com.zhuhao.demomybatis.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoMybatisApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List<Student> studentList = studentMapper.selectList(null);
        studentList.forEach(System.out::println);
    }

    @Test
    public void insertStudent(){

        Student student = new Student();
        student.setName("zhu");
        student.setAge(190);
        int result = studentMapper.insert(student);
        System.out.println(result);
        System.out.println(student);
    }

}
