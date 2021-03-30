package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 16:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Slf4j
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/count")
    @ResponseBody
    public String studentCount() {
        log.trace("轨迹");
        log.info("查询当前学生总人数");//打印日志信息
        log.warn("警告");
        log.error("错误");
        Integer count = studentService.queryStudentCount();
        return "学生总人数为：" + count;
    }
}
