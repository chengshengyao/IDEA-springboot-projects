package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.spirngboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/23 17:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface StudentService {
    Student queryStudentById(Integer id);

    Integer queryAllStudentCount();
}
