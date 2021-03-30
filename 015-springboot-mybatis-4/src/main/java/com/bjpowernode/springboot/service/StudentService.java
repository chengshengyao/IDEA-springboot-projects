package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/20 0:32
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Service
public interface StudentService {
    Student queryStudentById(Integer id);
}
