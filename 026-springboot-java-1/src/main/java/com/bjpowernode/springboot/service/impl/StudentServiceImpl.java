package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/23 23:38
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
