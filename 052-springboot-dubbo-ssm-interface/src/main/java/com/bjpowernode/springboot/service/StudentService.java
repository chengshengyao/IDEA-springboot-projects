package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/4/3 23:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface StudentService {
    Student queryStudentById(Integer id);
}
