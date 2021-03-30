package com.bjpowernode.spirngboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.spirngboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/23 17:40
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class StudentController {
    @Reference(interfaceName = "com.bjpowernode.springboot.service.StudentService"
            , version = "1.0.0"
            , check = false)
     StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(@PathVariable("id") Integer id, Model model) {
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @GetMapping("/student/all/count")
    @ResponseBody
    public Object allStudentCount(){
        Integer count = studentService.queryAllStudentCount();
        return "学生总人数为" + count;
    }
}
