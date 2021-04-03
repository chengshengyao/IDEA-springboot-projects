package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/4/3 23:35
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String StudentDetail(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

}
