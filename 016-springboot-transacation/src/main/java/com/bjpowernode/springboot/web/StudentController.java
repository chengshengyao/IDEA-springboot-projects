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
 * @CreateDate: 2021/2/21 19:25
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/update")
    @ResponseBody
    public Object update(Integer id, String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int result = studentService.updateStudentById(student);
        return "修改学生编号为"+id+"的修改结果为"+result;
    }

}
