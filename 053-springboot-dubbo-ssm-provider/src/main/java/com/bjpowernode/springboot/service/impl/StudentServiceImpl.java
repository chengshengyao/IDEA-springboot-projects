package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/4/3 23:47
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
