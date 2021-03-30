package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/19 21:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller

public class StudentController {
    //业务层呼应控制层
    @Autowired
    private StudentService sudentService;

    @RequestMapping("/student")
    @ResponseBody
    public Student queryStudentByID(Integer id) {
//            调用service方法
        return sudentService.queryStudentByID(id);
    }
}
