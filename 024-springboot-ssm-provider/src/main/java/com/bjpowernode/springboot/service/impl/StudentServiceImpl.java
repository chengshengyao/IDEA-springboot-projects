package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.spirngboot.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/23 17:58
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Component
//暴露接口服务
@Service(interfaceName = "com.bjpowernode.springboot.service.StudentService"
        , version = "1.0.0"
        , timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    //redis模板类对象
    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        //提升系统性能，用户体验提升
        //首先在Redis缓存中进行查询。如果没有，去数据库查询并加入redis缓存中
        //判断
            Integer allStudentCount = (Integer)redisTemplate.opsForValue().get("allStudentCount");
        if ( null ==allStudentCount ) {
            allStudentCount = studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount", allStudentCount, 30, TimeUnit.SECONDS);

        }

        return allStudentCount;
    }
}
