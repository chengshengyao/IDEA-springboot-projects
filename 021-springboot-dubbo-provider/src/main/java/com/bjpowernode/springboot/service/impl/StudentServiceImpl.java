package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/22 19:15
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Component
//暴露服务接口
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public int queryAllStudentCount() {
        //调用数据持久层
        return 99999;
    }
}
