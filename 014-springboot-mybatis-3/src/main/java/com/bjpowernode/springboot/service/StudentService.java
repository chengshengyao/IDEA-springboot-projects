package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/19 21:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

public interface StudentService {
    //引入持久层呼应业务层
    Student queryStudentByID(Integer id);

}
