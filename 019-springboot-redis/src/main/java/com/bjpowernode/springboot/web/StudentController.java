package com.bjpowernode.springboot.web;

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
 * @CreateDate: 2021/2/22 10:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/put")
    @ResponseBody
    public Object put(String key,String value){
        studentService.put(key,value );
        return "值已成功放入Redis";
    }
    @RequestMapping("/get")
    @ResponseBody
    public Object get(){
        String value = studentService.get("hello");

        return "数据count为"+value;
    }
}
